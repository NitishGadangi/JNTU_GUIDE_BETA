package nitish.build.com.jgtest2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import org.json.JSONException;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class RefBooksBtmSht extends BottomSheetDialogFragment {

    int ClickPos;
    String webData;
    String[] jsonNames,jsonLinks;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.custom_bottom_sheet,container,false);
        Button viewBtn = v.findViewById(R.id.btmShtView),
                downloadBtn = v.findViewById(R.id.btmShtDownload);
        TextView head = v.findViewById(R.id.btmShtHead),
                Des = v.findViewById(R.id.btmShtDes);

        if (getArguments() != null){
            ClickPos = getArguments().getInt("ClickPos");
            webData = getArguments().getString("webData");
        }

        try {
            jsonNames = ArrayListSetter.getStringSetFromJson(webData,"name");
            jsonLinks = ArrayListSetter.getStringSetFromJson(webData,"link");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        head.setText(jsonNames[ClickPos]);

        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toView = new Intent(getActivity(),webDisplay.class);
                toView.putExtra("link",jsonLinks[ClickPos]);
                startActivity(toView);
            }
        });

        return v;
    }


}
