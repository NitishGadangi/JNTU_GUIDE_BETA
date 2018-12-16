package nitish.build.com.jgtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.shockwave.pdfium.PdfDocument;

import java.util.List;

public class PdfViewerTest extends AppCompatActivity {

    PDFView pdfView;
    Integer pageNumber = 0;
    String pdfFileName;
    String[][] subjStringArrAr;
    int codeCourseBranchYearSemSubjPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer_test);

        Intent sourceIntent = getIntent();
        codeCourseBranchYearSemSubjPos = sourceIntent.getIntExtra("CourseBranchYearSemSubj",11111);

        int courseBranchYearSem=(codeCourseBranchYearSemSubjPos/10);
        int subjPos=(codeCourseBranchYearSemSubjPos-(courseBranchYearSem*10));


        //int[] arrr={2,3,4,5};
        try {
            subjStringArrAr=ArrayListSetter.setSubjectList(ArrayListSetter.extractCodeForSubject(courseBranchYearSem));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        String[] strarr ={"2","5"};

        pdfView= (PDFView)findViewById(R.id.pdfTest);
        pdfView.fromAsset("fsyll_btech_ece17.pdf")
                .pages(generatePages(subjStringArrAr[subjPos][2],subjStringArrAr[subjPos][3]))
                .defaultPage(pageNumber)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .onPageChange(new OnPageChangeListener() {
                    @Override
                    public void onPageChanged(int page, int pageCount) {
                        pageNumber = page;
                        setTitle(String.format("%s %s / %s", pdfFileName, page + 1, pageCount));
                    }
                })
                .enableAnnotationRendering(true)
                .onLoad(new OnLoadCompleteListener() {
                    @Override
                    public void loadComplete(int nbPages) {
                        PdfDocument.Meta meta = pdfView.getDocumentMeta();
                        printBookmarksTree(pdfView.getTableOfContents(), "-");
                    }
                })
                .scrollHandle(new DefaultScrollHandle(this))
                .load();

    }
    public int[] generatePages(String start,String end){
        int pos=0;
        int startI = Integer.parseInt(start);
        int endI = Integer.parseInt(end);
        int pages[] =new int[Math.abs(endI-startI)+1];
        for (int i=(startI-1);i<endI;i++){
            pages[pos]=i;
            pos++;
        }
        return pages;
    }



    public void printBookmarksTree(List<PdfDocument.Bookmark> tree, String sep) {
        for (PdfDocument.Bookmark b : tree) {

            //Log.e(TAG, String.format("%s %s, p %d", sep, b.getTitle(), b.getPageIdx()));

            if (b.hasChildren()) {
                printBookmarksTree(b.getChildren(), sep + "-");
            }
        }
    }


}
