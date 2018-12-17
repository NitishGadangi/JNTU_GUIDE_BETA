package nitish.build.com.jgtest2;

public class AllStringsArrays {
    static String[] COURSES = {"B.Tech","B.Tech IDP MBA","B.Tech IDP M.Tech","M.Tech","M.sc"};
    static String[] COURSESDES = {"ECE, CIVIL, EEE, MECH., CSE,Met,Chem.........","All B.Tech+MBA IDP COURSES",
            "All B.Tech+M.Tech IDP COURSES","All M.Tech COURSES","All M.Sc COURSES"};
    static String[] BRANCHESBTECH ={"ECE","CIVIL","EEE","MECHANICAL","CSE","METALLURGY","CHEMICAL"};
    static String[] BRANCHES_IDP ={"ECE","CIVIL","EEE","MECHANICAL","CSE"};
    static String[] YEARS = {"I Year","II Year","III Year","IV Year"};
    static String[] YEARS_IDP = {"I Year","II Year","III Year","IV Year","V Year"};
    static String[] BRANCHES_MTECH ={};
    static String[] YEARS_MTECH = {};
    static String[] BRANCHES_MSC ={};
    static String[] YEARS_MSC = {};
    static String[] SEMESTERS = {"1st Sem R17","2nd Sem R17"};

    //--------All SUBJECTS TO BE DECLARED HERE-----------//
    public static String[] ECE211={"M-III","Mathematics - III","46","48"},
            ECE212={"S&S","Signals and Systems","49","51"},
            ECE213={"ET","Electrical Technology","52","53"},
            ECE214={"AE","Analog Electronics","54","55"},
            ECE215={"NA","Network Analysis","56","57"},
            ECE216={"GS","Gender Senisitization","58","61"},
            ECE217={"AE LAB I","Analog Electronics Lab I","62","62"},
            ECE218={"ET lab","Electrical Technology Lab","63","63"},
            ECE219={"BS LAB","Basic Simulation Lab","64","64" },

            ECE221={"STLD","Switching Theory and Logic Design","65","67"},
            ECE222={"PDC","Pulse and Deigital circuits","68","69"},
            ECE223={"EMTL","Electromagnetic Theory","70","72"},
            ECE224={"AC","Analog communication","73","75"},
            ECE225={"CS","Control Systems","76","78"},
            ECE226={"AC LAB","Analog Communications Lab","79","79"},
            ECE227={"PDC LAB","Pulse and Digital Circuits Lab","80","80"},
            ECE228={"AE LAB II","Analog Electronics Lab 2","81","81"},
            ECE229={"HVPE","Human Values and Professional Ethics","82","83"},

            ECE311={"LDIA","Linear and Digital IC apps","84","85"},
                    ECE312={"AWP","Antennas and Wave propagation","86","89"},
                    ECE313={"DC","Digital Communications","90","91"},
                    ECE314={"OE I","Open Elective 1","164","190"},
                    ECE315={"MEFA","...","92","93"},
                    ECE316={"LIA LAB","Linear IC applications Lab","94","94"},
                    ECE317={"DC LAB","Digital Communications Lab","95","95"},
                    ECE318={"DESIGN LAB","Design lab","96","96"},

            ECE321={"OE II","....","191","219"},
                ECE322={"PE I","...","97","106"},
                    ECE323={"PE II","","107","114"},
                    ECE324={"MP & MC","Micro Processors and Micro Controllers","115","116"},
                    ECE325={"DSP","Digital Signal Processing","116","119"},
                    ECE326={"AELCS LAB","Adv English language and .....","120","123"},
                    ECE327={"DSP LAB","Digital signal Processing Lab","124","124"},
                    ECE328={"MP & MC LAB","Micro Processors and Micro Controllers Lab","125","125"},

            ECE411={"MWE","MicroWave Engg.","126","128"},
                    ECE412={"PE III","...","128","139"},
                    ECE413={"PE IV","...","140","147"},
                    ECE414={"PE V","...","148","156"},
                    ECE415={"VLSI","VLSI Design","157","158"},
                    ECE416={"VLSI & ECAD LAB","VLSI and E-CAD Lab","159","160"},
                    ECE417={"MWE LAB","MicroWave Engineering Lab","161","161"},

            ECE421={"OE III","...","220","246"},
                    ECE422={"Mngmnt Sc.","Management Science","162","163"},

            CVL211={"P & S","Probability and Statistics","45","46"},
                    CVL212={"SM 1","Strength of Materials 1","47","49"},
                    CVL213={"BMCP","Building Materials,Construction & planning","50","51"},
                    CVL214={"Surveying","Surveying","52","54"},
                    CVL215={"FM","Fluid Mechanics","55","56"},
                    CVL216={"CAD Lab 1","Computer aided drafting 1","57","57"},
                    CVL217={"SM Lab1","Strength Lab 1","58","58"},
                    CVL218={"Surveying Lab 1","...","59","59"},
                    CVL219={"HVPE","...","60","61"},

            CVL221={"SM 2","Strength of Materials 2","62","64"},
                    CVL222={"HH & M","Hydraulics & Hydralic Machinery","65","66"},
                    CVL223={"SA 1","Structural analysis 1","67","68"},
                    CVL224={"EG","Engineering Geology","69","71"},
                    CVL225={"ENV. Eng.","Environmental engineering","72","73"},
                    CVL226={"GS Lab","Gender Senisitization Lab","74","77"},
                    CVL227={"EG lab","Engineering Geology Lab","78","78"},
                    CVL228={"Env. Engg. Lab","Environmental Engineering lab","79","79"},
                    CVL229={"FM & HM Lab","Fluid Mechanics and Hydraulics Machinery Lab","80","80"},

            //CVL311={"","","",""},;
            CVL312={"MEFA","...","81","83"},
                    CVL313={"DRCS","Design of Reinforced Concrete Structures","84","85"},
                    CVL314={"SM","Soil Mechanics","86","87"},
                    CVL315={"WRE 1","Water Resource Engineering 1","88","89"},
                    CVL316={"AELCS Lab","Adv. ELCS Lab","90","94"},
                    CVL317={"Surv Lab 2","Surveying lab 2","95","95"},
                    CVL318={"GE Lab","Geo technology Lab","96","96"},

            //CVL321={"","","",""},
            CVL322={"PE 1","...","118","125"},
                    CVL323={"PE 2","...","126","132"},
                    CVL324={"DSS","Design of Steel Structures","99","100"},
                    CVL325={"TE","Transportation Engineering","101","102"},
                    CVL326={"TE Lab","Transportation Engineering lab","103","103"},
                    CVL327={"CAD Lab 2","...","104","104"},
                    CVL32={"CT Lab","Concrete Technology Lab","106","107"},

            CVL411={"PE 3","...","133","140"},
                    CVL412={"PE 4","...","141","148"},
                    CVL413={"PE 5","...","149","156"},
                    CVL414={"FE","Foundation Engineering","110","111"},
                    CVL415={"PC","Pretressed Concrete","112","113"},
                    CVL416={"CAD & Drafting lab 2","...","114","114"},
                    CVL417={"GIS & Adv. Surveying lab","...","117","117"},


            //EEE211 ={"","","",""},;
            EEE212 ={"EMF","Electromagnetic Field","48","50"},
                    EEE213 ={"EC","Electric Circuits","51","52"},
                    EEE214 ={"EM 1","Electrical Machines 1","53","54"},
                    EEE215 ={"EDC","Electronic Devices and circuits","55","56"},
                    EEE216 ={"GS Lab","Gender sensitization lab","57","60"},
                    EEE217 ={"EC Lab","Electronic Circuits Lab","61","61"},
                    EEE218 ={"EM Lab 1","Electrical Machines lab 1","62","62"},
                    EEE219 ={"BS lab","basic simulation lab","63","63"},

            EEE221 ={"STLD","Switching theory & Logic Design","64","65"},
                    EEE222 ={"CS","Control systems","66","68"},
                    EEE223 ={"PS 1","Power Systems 1","69","71"},
                    EEE224 ={"EM 2","Electrical Machines 2","72","74"},
                    EEE225 ={"EEM","Electrical and Electronic Measurements","75","77"},
                    EEE226 ={"EC Lab","Electrical Circuits lab","78","78"},
                    EEE227 ={"EM Lab 2","Electrical machines Lab","79","79"},
                    EEE228 ={"SEC Lab","Simulation and Electrical circuits","80","80"},
                    EEE229 ={"HVPE","...","81","82"},

            EEE311 ={"LDICA","Linear and Digital IC Applications","83","84"},
                    EEE312 ={"MP & MC","Microprocessor & MicroControllers","85","86"},
                    //EEE313 ={"","","",""},
                    EEE314 ={"MEFA","...","87","88"},
                    EEE315 ={"PS 2","Power Systems 2","89","91"},
                            EEE316 ={"CS Lab","Control Systems Lab","92","92"},
                            EEE317 ={"EEM Lab","electrical & electronic measurements lab","93","93"},
                            EEE318 ={"MP Lab","Microprocessors lab","94","94"},

            //EEE321 ={"","","",""},
            EEE322 ={"PE 1","...","95","101"},
                    EEE323 ={"PE 2","...","102","108"},
                    EEE324 ={"PE","Power Electronics","109","111"},
                    EEE325 ={"SGP","Switch Gear and Protection","112","113"},
                    EEE326 ={"AELCS","...","114","117"},
                    EEE327 ={"PE Lab","Power Electronics Lab","118","118"},
                    EEE328 ={"MC lab","Micro Controllers Lab","119","119"},

            EEE411 ={"DSP","Didita signal Processing","120","121"},
                    EEE412 ={"PE 3","...","122","127"},
                    EEE413 ={"PE 4","...","128","133"},
                    EEE414 ={"PE 5","...","134","139"},
                    EEE415 ={"PSOC","Power System Operation and Control","140","141"},
                    EEE416 ={"DSP Lab","Digital Signal Processing Lab","142","142"},

            //EEE421 ={"","","",""},;
            //EEE422 ={"","","",""},;
            EEE423 ={"PS Lab","Power Systems lab","145","145"};





    //------------Year Sem List Goes Here------------------//
    public static String[][] BECE21 ={ECE211,ECE212,ECE213,ECE214,ECE215,ECE216,ECE217,ECE218,ECE219},
            BECE22={ECE221,ECE222,ECE223,ECE224,ECE225,ECE226,ECE227,ECE228,ECE229},
            BECE31={ECE311,ECE312,ECE313,ECE314,ECE315,ECE316,ECE317,ECE318},
            BECE32={ECE321,ECE322,ECE323,ECE324,ECE325,ECE326,ECE327,ECE328},
            BECE41={ECE411,ECE412,ECE413,ECE414,ECE415,ECE416,ECE417},
            BECE42={ECE421,ECE422};

}
