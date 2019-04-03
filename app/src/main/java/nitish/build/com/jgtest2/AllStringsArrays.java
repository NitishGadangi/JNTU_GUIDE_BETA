package nitish.build.com.jgtest2;

public class AllStringsArrays {
    static String[] COURSES = {"B.Tech","B.Tech IDP MBA","B.Tech IDP M.Tech","M.Tech","M.sc"};
    static String[] COURSESDES = {"ECE , Civil , EEE , Mechanical , CSE ,Metallurgy ,Chemical .........",
            "All B.Tech+MBA IDP COURSES",
            "All B.Tech+M.Tech IDP COURSES","All M.Tech COURSES","All M.Sc COURSES"};
    static String[] BRANCHESBTECH ={"ECE","CIVIL","EEE","MECHANICAL","CSE","METALLURGY","CHEMICAL"};
    static String[] BRANCHES_IDP ={"ECE","CIVIL","EEE","MECHANICAL","CSE"};
    static String[] YEARS = {"I Year","II Year","III Year","IV Year"};
    static String[] YEARS_IDP = {"I Year","II Year","III Year","IV Year","V Year"};
    static String[] BRANCHES_MTECH ={};
    static String[] YEARS_MTECH = {};
    static String[] BRANCHES_MSC ={};
    static String[] YEARS_MSC = {};
    static String[] SEMESTERS = {"1st Sem R17","2nd Sem R17","1st Sem R18","2nd Sem R18"};
    static String[] ACADEMIC_CALENDARS = {"Holidays list","B.Tech Academic calendar"};
    static String[] TOOLS = {"Regulations","Sgpa Calculator","Cgpa calculator",
                            "Attendance Tracker","Attendance Tracker"};
    static  String[] CLASS_INFO = {"Time Tables","CR Info"},
            MY_CONTENT = {"My Syllabus","My Time Table","Stared Documents","My Reference Books"};


    //--------ICONS FOR ARRAYS GO HERE----------//

    static String[] RATE_OUR_APP ={"Rate our App",Integer.toString(R.drawable.ic_star)},
                    REPORT_A_PROBLEM={"Report A Problem",Integer.toString(android.R.drawable.stat_notify_error)},
                    SUGGEST_A_FEATURE ={"Suggest A Feature",Integer.toString(R.drawable.ic_idea)},
                    ABOUT_DEVELOPER = {"About Developer",Integer.toString(R.drawable.ic_about_dev)},
                    WHY_ADS={"Why Ads ?",Integer.toString(R.drawable.ic_question)},
                    ABOUT_APP ={"About App",Integer.toString(R.drawable.ic_about_app)},
                    UPCOMING_FEATURES={"Upcoming Features",Integer.toString(R.drawable.ic_question)};

    static  String[][] MORE_LIST ={RATE_OUR_APP,REPORT_A_PROBLEM,
            SUGGEST_A_FEATURE,ABOUT_DEVELOPER,WHY_ADS,ABOUT_APP,UPCOMING_FEATURES};



    //________End Of Icons_____________________//

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
            EEE423 ={"PS Lab","Power Systems lab","145","145"},

            MEC211 ={"M III","Mathematics III","45","47"},
                    MEC212 ={"M & M","Metallurgy and Mechanical Science","48","49"},
                    MEC213 ={"MS","Mechanics of Solids","50","51"},
                    MEC214 ={"TDM","Thermodynamics","52","54"},
                    MEC215 ={"KM","Kinematics of Machines","55","56"},
                    MEC216 ={"Machine Drawing","Machine Drawing practice","57","58"},
                    MEC217 ={"M & M lab","Mechanics of solids & Metallurgy lab","59","60"},
                    MEC218 ={"F & L lab","Fuels and Lubrication Lab","61","61"},
                    MEC219 ={"HVPE","Human values And professional Ethics","62","63"},

                    MEC221 ={"FM & HM","Fluid Mechanics & Hydraulic Machinery","64","65"},
                    MEC222 ={"TE 1","Thermal Engineering 1","66","68"},
                            MEC223 ={"DM","Dynamics Of Machines","69","70"},
                            MEC224 ={"PT","Production technology","71","72"},
                            MEC225 ={"ICS","Instrumentation & Control Systems","73","74"},
                            MEC226 ={"GS lab","Gender Sensitization Lab","73","78"},
                            MEC227 ={"FM & HM Lab","...","79","79"},
                            MEC228 ={"ICS Lab","Instrumentation & Control systems Lab","80","80"},
                            MEC229 ={"PT Lab","Production Technology","81","81"},

            //MEC31 ={"","","",""},
            MEC312 ={"MEFA","...","82","83"},
                    MEC313 ={"DMM 1","Design of Machine Members 1","84","85"},
                    MEC314 ={"TE 2","Thermal Engineering 2","86","87"},
                    MEC315 ={"MT & M","Machine Tools and Metrology","88","89"},
                    MEC316 ={"TE lab","Thermal Engineering Lab","90","90"},
                    MEC317 ={"MT & M Lab","...","91","91"},
                    MEC318 ={"AELCS","Adv ELCS Lab","92","95"},

            //MEC321 ={"","","",""},
            MEC322 ={"PE 1","...","96","103"},
                    MEC323 ={"PE 2","...","104","111"},
                    MEC324 ={"DMM 2","design of Machine Members 2","112","113"},
                    MEC325 ={"HT","Heat Transfer","114","116"},
                    MEC326 ={"K & D Lab","Kinematics & Dynamics lab","117","117"},
                    MEC327 ={"HT Lab","Heat Transfer Lab","118","118"},
                    MEC328 ={"AT Lab","Advanced Thermodynamics Lab","119","119"},

            MEC411 ={"PE 3","...","120","127"},
                    MEC412 ={"PE 4","...","128","135"},
                    MEC413 ={"PE 5","...","136","143"},
                    MEC414 ={"R&AC","...","144","145"},
                    MEC415 ={"CAD/CAM","...","146","147"},
                    MEC416 ={"CAD/CAM Lab","...","148","148"},

            //MEC421 ={"","","",""},
            //MEC422 ={"","","",""},
            MEC423 ={"R&AC Lab","...","153","153"},


            MET211 ={"M III","Mathematics 3","45","47"},
                    MET212 ={"MS","Mechanics of Solids","48","49"},
                    MET213 ={"FFR","Fuels,Furnaces and Refactories","50","51"},
                    MET214 ={"MD","Mineral Dressing","52","53"},
                    MET215 ={"T&K","Thermodynamics & Kinetics","54","55"},
                    MET216 ={"FFR Lab","Fuels,Furnaces and Refactories lab","54","55"},
                    MET217 ={"MD Lab","Mineral Dressing lab","57","57"},
                    MET218 ={"JAVA Lab","...","58","58"},
                    MET219 ={"HVPE","...","59","60"},

            MET221 ={"MF","Mechanics of fluids","61","62"},
                    MET222 ={"MA","Metallurgical Analysis","63","64"},
                    MET223 ={"PM","Physical Metallurgy","63","64"},
                    MET224 ={"MT","Metallurgical Thermodynamics","67","68"},
                    MET225 ={"PEM","Principle Of extractive Metallurgy","69","70"},
                    MET226 ={"GS Lab","Gender Senisitization Lab","71","74"},
                    MET227 ={"MA lab","Metallurgical Analysis lab","75","75"},
                    MET228 ={"PM Lab","Physical metallurgy Lab","76","76"},
                    MET229 ={"PEM Lab","...","77","77"},

            MET311 ={"OE 1","...","",""},
                    MET312 ={"MEFA","Managerial Economics and Financial analysis","78","79"},
                    MET313 ={"HTPH","Heat Treatrment and Phase Transformations","80","81"},
                    MET314 ={"MBM","Mechanical Behaviour of Metals","82","83"},
                    MET315 ={"IP","Iron Production","84","85"},
                    MET316 ={"AELCS LAB","Adv. ELCS Lab","86","89"},
                    MET317 ={"HTPH LAB","Heat Treatment & Phase Transformations Lab","90","90"},
                    MET318 ={"MBM Lab","Mechanical Behaviour of Metals Lab","9*1","91"},

            MET321 ={"OE 2","...","",""},
                    MET322 ={"PE 1","...","92","99"},
                    MET323 ={"PE 2","...","100","101"},
                    MET324 ={"MC","Metal Casting","102","103"},
                    MET325 ={"MF","Metal Forming","104","105"},
                    MET326 ={"MC LAB","Metal Casting Lab","106","106"},
                    MET327 ={"MF LAB","Metal Forming Lab","107","107"},
                    MET328 ={"MC LAB","Metal Characterization Lab","108","108"},

            MET411 ={"PE 3","...","109","112"},
                    MET412 ={"PE 4","...","113","118"},
                    MET413 ={"PE 5","...","119","123"},
                    MET414 ={"MJ","Metal Joining","124","125"},
                    MET415 ={"EM&C","Electro Metallurgy & Corrosion","127","128"},
                    MET416 ={"EM&C Lab","Electro Metallurgy and Corrosion Lab","129","129"},

            MET421 ={"MS","Management Science","130","133"},
                    MET422 ={"MJ LAB","Metal Joining Lab","134","134"};









    //---------R18--------

    static String[] BCEMI211 = {"M-3","mathematics 3","",""},
    BCEMI212 = {"M&EBC","Material and energy balance computations","1","2"},
    BCEMI213 = {"CEFM","chemical engineering fluid mechanics","3","4"},
    BCEMI214 = {"P&AC","physics and analytical chemistry lab","5","6"},
    BCEMI215 = {"MO","mechanical operations","7","8"},
    BCEMI216 = {"FM LAB","fluid mechanics lab","9","10"},
    BCEMI217 = {"P&AC LAB","physical and analytical chemistry lab","",""},
    BCEMI218 = {"MO LAB","mechanical operations lab","11","11"},
    BCEMI219 = {"ES","environmental science","12","12"},


    BCEMI221 = {"CET-1","chemical engineering thermodynamics-1","13","14"},
    BCEMI222 = {"BEE","BEE","15","16"},
    BCEMI223 = {"FME","fundamentals of management for engineers","17","17"},
    BCEMI224 = {"PHT","process heat transfer","18","19"},
    BCEMI225 = {"OC","organic chemistry","20","21"},
    BCEMI226 = {"BEE LAB","BEE lab","22","22"},
    BCEMI227 = {"CT&OS LAB","chemical technology and organic synthesis lab","23","23"},
    BCEMI228 = {"PHT LAB","process heat transfer lab","24","24"},

    BCEMI311 = {"PE-1","professional elective-1","25","30"},
    BCEMI312 = {"MTO-1","mass transfer operations-1","31","32"},
    BCEMI313 = {"CRE-1","chemical reaction engineering-1","33","34"},
    BCEMI314 = {"I&PC","instrumentation and process control","35","36"},
    BCEMI315 = {"CET-2","chemical engineering thermodynamics-2","37","38"},
    BCEMI316 = {"AEC LAB","advanced english communications lab","39","39"},
    BCEMI317 = {"MTO LAB-1","mass transfer operations lab-1","40","40"},
    BCEMI318 = {"I&PC LAB","instrumentation and process control lab","41","42"},


    BCEMI321 = {"OE-1","open elective-1","43","44"},
    BCEMI322 = {"PE-2","professional elective-2","45","46"},
    BCEMI323 = {"PM&S","process modeling and simulation","47","52"},
    BCEMI324 = {"MTO-2","mass transfer operations-2","55","56"},
    BCEMI325 = {"CRE-2","chemical reaction engineering-2","57","58"},
    BCEMI326 = {"PSL","process simulation lab","59","59"},
    BCEMI327 = {"MTO LAB-2","mass transfer operations lab-2","60","60"},
    BCEMI328 = {"CRE LAB","chemical reaction engineering lab","61","61"},
    BCEMI329 = {"IC/EITK","indian constitution/essence of indian traditional knowledge","62","62"},


    BCEMI411 = {"OE-2","open elective-2","63","66"},
    BCEMI412 = {"PE-3","professional elective-3","67","72"},
    BCEMI413 = {"PE-4","professional elective-4","73","78"},
    BCEMI414 = {"CPT&E","chemical process technology and economics","79","80"},
    BCEMI415 = {"TP","transport phenomena","81","82"},


    BCEMI421 = {"OE-3","open elective-3","86","87"},
    BCEMI422 = {"PE-5","professional elective-5","90","95"},
    BCEMI423 = {"PE-6","professional elective-6","96","101"},



    BCIVI211 = {"BMCP","building materials,construction and planning","1","2"},
    BCIVI212 = {"EG","engineering geology","3","4"},
    BCIVI213 = {"SM-1","strength of materials-1","5","6"},
    BCIVI214 = {"PS","probability and statistics","7","8"},
    BCIVI215 = {"FM","fluid mechanics","9","10"},
    BCIVI216 = {"CACED","computer aided civil engineering drawing","11","11"},
    BCIVI217 = {"SM LAB","strength of materials lab","12","12"},
    BCIVI218 = {"EG LAB","engineering geology lab","13","14"},


    BCIVI221 = {"BEEE","basics of electrical and electronics engineering","15","16"},
    BCIVI222 = {"BME","basics of mechanical engineering","17","18"},
    BCIVI223 = {"SG","surveying and geomatics","19","20"},
    BCIVI224 = {"SM-2","strength of materials-2","21","22"},
    BCIVI225 = {"HHM","hydraulics and hydraulic machinery","23","24"},
    BCIVI226 = {"SA-1","structural analysis-1","25","26"},
    BCIVI227 = {"S LAB","surveying lab","27","27"},
    BCIVI228 = {"BEE LAB","basic electrical and electronics lab","28","28"},
    BCIVI229 = {"FM&HM LAB","fluid mechanics and hydraulic machinery lab","29","29"},


    BCIVI311 = {"SA-2","structural analysis-2","30","31"},
    BCIVI312 = {"GE","geotechnical engineering","32","33"},
    BCIVI313 = {"SE-1","structural engineering-1","34","35"},
    BCIVI314 = {"TE","transportation engineering","36","38"},
    BCIVI315 = {"PE","professional ellective","",""},
    BCIVI316 = {"EC&A","engineering economics and accounting","39","40"},
    BCIVI317 = {"HE&CT LAB","highway engineering and concrete technology lab","41","42"},
    BCIVI318 = {"GE LAB","geotechnical engineering lab","43","43"},
    BCIVI319 = {"AC LAB","advanced communications lab","44","47"},


    BCIVI321 = {"EE","environmental engineering","48","49"},
    BCIVI322 = {"FE","foundatioin engineering","50","51"},
    BCIVI323 = {"SE-2","structural engineering-2","52","53"},
    BCIVI324 = {"H&WRE","hydrology and water resources engineering","54","55"},
    BCIVI325 = {"PE","professional elective","",""},
    BCIVI326 = {"OE-1","open elective-1","",""},
    BCIVI327 = {"EE LAB","environmental engineering lab","56","56"},
    BCIVI328 = {"CAD LAB","computer aided design lab","57","57"},


    BCIVI411 = {"ECPM","estimation,costing and project management","58","59"},
    BCIVI412 = {"PE-3","professional elective-3","",""},
    BCIVI413 = {"PE-4","professional elective-4","",""},
    BCIVI414 = {"OE-2","open elective-2","",""},
    BCIVI415 = {"PPL&E","professional practice law and ethics","",""},


    BCIVI421 = {"PE-5","professional elective-5","",""},
    BCIVI422 = {"PE-6","professional elective-6","",""},
    BCIVI423 = {"OE-3","open elective-3","",""},




    BCSEI111 = {"M-1","mathemtics-1","1","2"},
    BCSEI112 = {"BEE","basic electrical engineering","3","5"},
    BCSEI113 = {"EC","engineering chemistry","6","7"},
    BCSEI114 = {"E","english","8","10"},
    BCSEI115 = {"BEE LAB","basic electrical engineering lab","18","19"},
    BCSEI116 = {"EC LAB","engineering chemistry lab","13","14"},
    BCSEI117 = {"EL&CS","english language and communication skills","15","17"},
    BCSEI118 = {"EW","engineering workshop","11","12"},


    BCSEI121 = {"M-2","mathematics-2","20","21"},
    BCSEI122 = {"AP","applied physics","22","23"},
    BCSEI123 = {"PPS","programming for problem solving","24","25"},
    BCSEI124 = {"EG","engineering graphics","26","27"},
    BCSEI125 = {"AP LAB","applied physics lab","28","28"},
    BCSEI126 = {"PPS LAB","programming for problem solving lab","29","32"},


    BCSEI211 = {"A&DE","analog and digital electronics","33","34"},
    BCSEI212 = {"DS","data structures","35","36"},
    BCSEI213 = {"DM","discrete mathematics","37","38"},
    BCSEI214 = {"CO&A","computer organisation and architecture","39","40"},
    BCSEI215 = {"OOP","object oriented programming","41","42"},
    BCSEI216 = {"A&DE LAB","analog and digital electronics lab","43","43"},
    BCSEI217 = {"DS LAB","data structures lab","44","45"},
    BCSEI218 = {"OOP C++ LAB","object oriented programming using c++ lab","46","47"},
    BCSEI219 = {"ITW LAB","IT workshop lab","48","51"},


    BCSEI221 = {"COSM","computer oriented statistical methods","52","53"},
    BCSEI222 = {"BE&FA","bussiness economics and financial analysis","54","55"},
    BCSEI223 = {"OS","operating systems","56","57"},
    BCSEI224 = {"DMS","database mangement systems","58","59"},
    BCSEI225 = {"D&AA","design and analysis of algorithms","60","61"},
    BCSEI226 = {"OS LAB","operating systems lab","62","63"},
    BCSEI227 = {"DMS LAB","database management systems lab","64","65"},
    BCSEI228 = {"A LAB JAVA","algorithms lab using java","66","66"},


    BCSEI311 = {"FL&AT","formal language and automata theory","67","69"},
    BCSEI312 = {"SE","software engineering","70","71"},
    BCSEI313 = {"CN","computer networks","72","73"},
    BCSEI314 = {"AI","artificial intelligence","74","76"},
    BCSEI315 = {"PE-1","professional elective-1","77","86"},
    BCSEI316 = {"PE-2","professional elective-2","87","96"},
    BCSEI317 = {"SE LAB","software engineering lab","97","98"},
    BCSEI318 = {"CN LAB","computer networks lab","99","100"},
    BCSEI319 = {"ACS LAB","advanced communication skills lab","101","103"},


    BCSEI321 = {"ML","machine learning","104","106"},
    BCSEI322 = {"CD","compiler design","107","108"},
    BCSEI323 = {"WT","web technologies","109","110"},
    BCSEI324 = {"PE-3","professional elective-3","111","120"},
    BCSEI325 = {"OE-1","open elective-1","121","126"},
    BCSEI326 = {"ML LAB PYTHON","machine learning lab using python","127","128"},
    BCSEI327 = {"CD&WT LAB","compiler design and web technologies lab","129","132"},
    BCSEI328 = {"PE-3 LAB","professional elective-3 lab","133","139"},


    BCSEI411 = {"IS","information security","140","141"},
    BCSEI412 = {"BDA","big data analysis","142","143"},
    BCSEI413 = {"PE-4","professional elective-4","144","153"},
    BCSEI414 = {"PE-5","professional elective-5","154","163"},
    BCSEI415 = {"OE-2","open elective-2","164","172"},
    BCSEI416 = {"BDA LAB","big data analytics lab","173","173"},


    BCSEI421 = {"MFE","management fundamentals for engineers","174","175"},
    BCSEI422 = {"PE-6","professional elective-6","176","185"},
    BCSEI423 = {"OE-3","open elective-3","186","193"},



    BECEI211 = {"ED&C","electronic devices and circuits","1","2"},
    BECEI212 = {"NA&TL","network analysis and transmission lines","3","4"},
    BECEI213 = {"S&S","signals and systems","5","6"},
    BECEI214 = {"ST&LD","switching theory and logic design","7","8"},
    BECEI215 = {"PT&SP","probability theory and stochastic process","9","10"},
    BECEI216 = {"ED&C LAB","electronic devices and circuits lab","11","12"},
    BECEI217 = {"DLD LAB","digital logic design lab","12","12"},
    BECEI218 = {"BSL","basic simulation lab","13","13"},
    BECEI219 = {"ES","environmental science","",""},


    BECEI221 = {"M-3","mathematics-3","14","15"},
    BECEI222 = {"EF&W","electromagnetic fields and waves","16","17"},
    BECEI223 = {"A&DC","analog and digital communications","18","19"},
    BECEI224 = {"L&DIC","linear and digital integrated circuits","20","21"},
    BECEI225 = {"A&PC","analog and pulse circuits","22","23"},
    BECEI226 = {"A&DC LAB","analog and digital communications lab","24","24"},
    BECEI227 = {"L&DIC LAB","linear and digital integrated circuits lab","25","25"},
    BECEI228 = {"A&PC LAB","analog and pulse circuits lab","26","26"},
    BECEI229 = {"GS","gender sensitization","",""},


    BECEI311 = {"BE&FA","bussiness economics and financial analysis","27","28"},
    BECEI312 = {"M&C","microprocessors and controllers","29","30"},
    BECEI313 = {"CN","computer networks","31","32"},
    BECEI314 = {"CS","control systems","33","34"},
    BECEI315 = {"PE-1","professional elective-1","35","40"},
    BECEI316 = {"M&C LAB","microprocessors and controllers lab","41","41"},
    BECEI317 = {"CN LAB","computer networks lab","42","42"},
    BECEI318 = {"AEL&CS LAB","advanced english and communnications lab","43","44"},
    BECEI319 = {"AC","audit course","",""},


    BECEI321 = {"A&P","antennas and propogation","45","46"},
    BECEI322 = {"DSP","digital signal processing","47","48"},
    BECEI323 = {"VLSID","VLSI deisgn","49","50"},
    BECEI324 = {"PE-2","professional elective-2","51","56"},
    BECEI325 = {"OE-1","open elective-1","57","57"},
    BECEI326 = {"DSP LAB","digital signal processing lab","58","58"},
    BECEI327 = {"VLSID LAB","VLSI design lab","59","59"},
    BECEI328 = {"AC LAB","advanced communications lab","60","60"},
    BECEI329 = {"AC","audit course","",""},


    BECEI411 = {"ME","microwave engineering","61","62"},
    BECEI412 = {"PE-3","professional elective-3","63","68"},
    BECEI413 = {"PE-4","professional elective-4","69","74"},
    BECEI414 = {"OE-2","open elective-2","75","76"},
    BECEI415 = {"ME LAB","microwave engineering lab","77","77"},
    BECEI416 = {"MFE","management fundamentals for engineers","78","79"},

    BECEI421 = {"PE-5","professional elective-5","80","85"},
    BECEI422 = {"PE-6","professional elective-6","86","91"},
    BECEI423 = {"OE-3","open elective-3","92","93"},



    BEEEI111 = {"M-1","mathematics-1","1","2"},
    BEEEI112 = {"C","chemistry","3","4"},
    BEEEI113 = {"BEE","basic electrical engineering","5","6"},
    BEEEI114 = {"EW","engineering workshop","7","7"},
    BEEEI115 = {"E","english","8","9"},
    BEEEI116 = {"C LAB","chemistry lab","10","10"},
    BEEEI117 = {"EL&CS LAB","english language and communication skills lab","11","12"},
    BEEEI118 = {"BEE LAB","basic electrical engineering lab","13","13"},


    BEEEI121 = {"M-2","mathematics-2","14","15"},
    BEEEI122 = {"AP","applied physics","16","17"},
    BEEEI123 = {"PPS","programming for problem solving","18","19"},
    BEEEI124 = {"EG","engineering graphics","20","20"},
    BEEEI125 = {"AP LAB","applied physics lab","21","21"},
    BEEEI126 = {"PPS LAB","programming for problem solving lab","22","23"},


    BEEEI211 = {"M-3","mathematics-3","24","25"},
    BEEEI212 = {"ECA","electrical circuit analysis","26","27"},
    BEEEI213 = {"AE","analog electronics","28","29"},
    BEEEI214 = {"EM-1","electrical machines-1","30","31"},
    BEEEI215 = {"EMF","electro magnetic fields","32","33"},
    BEEEI216 = {"EM LAB-1","electrical machines lab-1","34","34"},
    BEEEI217 = {"AE LAB","analog electronics lab","35","35"},
    BEEEI218 = {"EC LAB","electrical circuits lab","36","36"},


    BEEEI221 = {"EM","engineering mechanics","37","38"},
    BEEEI222 = {"EM-2","elecctrical machines-2","39","40"},
    BEEEI223 = {"DE","digital electronics","41","42"},
    BEEEI224 = {"CS","control systems","43","44"},
    BEEEI225 = {"PS-1","power system-1","45","46"},
    BEEEI226 = {"DE LAB","digital electronics lab","47","47"},
    BEEEI227 = {"EM LAB-2","electrical machines lab-2","48","48"},
    BEEEI228 = {"CS LAB","control systems lab","49","49"},


    BEEEI311 = {"PE","power electronics","50","51"},
    BEEEI312 = {"PS-2","power system-2","52","53"},
    BEEEI313 = {"M&I","measurements and instrumentation","54","55"},
    BEEEI314 = {"PE-1","professional elective-1","56","61"},
    BEEEI315 = {"BE&FA","business economics and financial accounting","62","62"},
    BEEEI316 = {"ES LAB","electrical simulation lab","63","63"},
    BEEEI317 = {"PE LAB","power electronics lab","64","64"},
    BEEEI318 = {"M&I LAB","measurements and instrumentation lab","65","65"},
    BEEEI319 = {"ACS LAB","advanced communication skills lab","66","67"},


    BEEEI321 = {"OE-1","open elective-1","69","71"},
    BEEEI322 = {"PE-2","professional elective-2","72","77"},
    BEEEI323 = {"S&S","signals and systems","78","79"},
    BEEEI324 = {"M&M","microprocessors and microcontrollers","80","80"},
    BEEEI325 = {"PSP","power system protection","81","82"},
    BEEEI326 = {"PSO&C","power system operation and control","83","84"},
    BEEEI327 = {"PS LAB","power system lab","85","85"},
    BEEEI328 = {"M&M LAB","microprocessors and microcontrollers lab","86","86"},
    BEEEI329 = {"S&S LAB","signals and systems lab","87","87"},


    BEEEI411 = {"OE-2","open elective-2","88","89"},
    BEEEI412 = {"PE-3","professional elective-3","90","95"},
    BEEEI413 = {"PE-4","professional elective-4","96","100"},
    BEEEI414 = {"FM","fundamentals of management","101","101"},
    BEEEI415 = {"E&ED LAB","electrical and electronics design lab","102","102"},


    BEEEI421 = {"OE-3","open elective-3","103","105"},
    BEEEI422 = {"PE-5","professional elective-5","106","111"},
    BEEEI423 = {"PE-6","professional elective-6","112","117"},



    BMECI111 = {"EM-1","engineering mathematics-1","1","2"},
            BMECI112 = {"EP","engineering physics","3","4"},
            BMECI113 = {"PPS","programming for problem solving","5","6"},
            BMECI114 = {"CEM","classical engineering mechanics","7","8"},
            BMECI115 = {"EP LAB","engg. physics lab","9","9"},
            BMECI116 = {"PPS","programming for problem solving","10","11"},


    BMECI121 = {"EM-2","engineering mathematics-2","12","13"},
            BMECI122 = {"EC","engg. chemistry","14","15"},
            BMECI123 = {"EG","engineering graphics","16","16"},
            BMECI124 = {"EW","engineering workshop","17","17"},
            BMECI125 = {"E","english","18","20"},
            BMECI126 = {"EC LAB","engg. chemistry lab","21","21"},
            BMECI127 = {"ELCS","english language and communication skills","22","24"},
            BMECI128 = {"S&G","sports and games","",""},


    BMECI211 = {"EM-3","engineering mathematics-3","25","26"},
            BMECI212 = {"MS","mechanics of solids","27","28"},
            BMEC1213 = {"MSM","material science an metallurgy","29","30"},
            BMECI214 = {"PT","production technology","31","32"},
            BMECI215 = {"T","thermodynamics","33","34"},
            BMECI216 = {"PT LAB","production technology lab","35","35"},
            BMECI217 = {"MDP","machine drawing practice","36","36"},
            BMECI218 = {"MS&MS LAB","material science and mechanics of solids lab","37","38"},
            BMECI219 = {"CI","constitution of india","39","40"},


    BMECI221 = {"BEEE","basics of electrical and electronics engineering","41","42"},
            BMECI222 = {"KM","kinematics of machinery","43","44"},
            BMECI223 = {"TE-1","thermal engineering-1","45","46"},
            BMECI224 = {"FM&HM","fluid mechanics and hydraulic machinery","47","48"},
            BMECI225 = {"I&CS","instrumentation and control systems","49","50"},
            BMECI226 = {"BEEE LAB","basics of electrical and electronics engineering lab","51","51"},
            BMECI227 = {"FM&HM LAB","fluid mechanics and hydraulic machinery lab","52","52"},
            BMECI228 = {"I&CS LAB","instrumentation and control systems lab","53","53"},
            BMECI229 = {"ES","environmental science","54","55"},


    BMECI311 = {"DM","dynamics of machinery","56","56"},
            BMECI312 = {"DMME-1","design of machine elements-1","57","58"},
            BMECI313 = {"MMT","metrology and machine tools","59","60"},
            BMECI314 = {"BE&FA","bussiness economics and financial analysis","61","62"},
            BMECI315 = {"TE-2","thermal engineering-2","63","64"},
            BMECI316 = {"OR","operations research","65","66"},
            BMECI317 = {"TE-1 LAB","thermal engineering-1 lab","67","67"},
            BMECI318 = {"M&MT LAB","metrology and machine tools lab","68","68"},
            BMECI319 = {"K&D LAB","kinematics and dynammics lab","69","69"},
            BMECI31A = {"GS LAB","gender sensitization lab","70","72"},



    BMECI321 = {"DME-2","design of machine elements-2","73","73"},
            BMECI322 = {"HT","heat transfer","74","75"},
            BMECI323 = {"CAD&CAM","CAD and CAM","76","77"},
            BMEIC324 = {"PE-1","professional elective-1","78","81"},
            BMECI325 = {"QTBD","quantitative techniques for bussiness desisions","82","83"},
            BMECI326 = {"R&AC","refrigeration and air conditioning","84","85"},
            BMECI327 = {"HT LAB","heat transfer lab","86","86"},
            BMECI328 = {"TE-2 LAB","thermal engineering-2 lab","87","87"},
            BMECI329 = {"ACS LAB","advanced communication skills lab","88","90"},


    BMECI411 = {"FEM","finite element methods","91","92"},
            BMECI412 = {"PE-2","professional elective-2","93","96"},
            BMECI413 = {"PE-3","professional elective-3","97","102"},
            BMECI414 = {"PE-4","professional elective-4","103","106"},
            BMECI415 = {"BME","basic mechanical engineering","107","107"},
            BMECI416 = {"CAD/CAM LAB","CAD/CAM lab","108","108"},
            BMECI417 = {"R&AC LAB","R and AC lab","109","109"},


    BMECI421 = {"PE-5","professional elective-5","110","115"},
            BMECI422 = {"PE-6","professional elective-6","116","120"},
            BMECI423 = {"NCSE","non-conventional sources of enrgy","121","122"},




    BMETI211 = {"M-3","mathematics-3","",""},
            BMETI212 = {"MD","mineral dressing","1","2"},
            BMETI213 = {"PM","physical metallurgy","3","4"},
            BMETI214 = {"T&K","thermodynamics and kinetics","5","6"},
            BMETI215 = {"MA","metallurgical analysis","7","8"},
            BMETI216 = {"MD LAB","mineral dressing lab","9","9"},
            BMETI217 = {"M LAB","metallography lab","10","10"},
            BMETI218 = {"MA LAB","metallurgical analysis lab","11","11"},
            BMETI219 = {"ES","environmental science","12","12"},


    BMETI221 = {"BEE","basic electrical engineering","13","14"},
            BMETI222 = {"EE","economics for engineers","15","15"},
            BMETI223 = {"HT&PT","heat treatment and phase transformations","16","17"},
            BMETI224 = {"PEM","principles of extractive metallurgy","18","19"},
            BMETI225 = {"MT","metallurgical thermodynamics","20","21"},
            BMETI226 = {"BEE LAB","basic electrical engineering lab","22","22"},
            BMETI227 = {"PEM LAB","principles of extractive metallurgy lab","23","23"},
            BMETI228 = {"HT&PT LAB","heat transfer and phase transformations lab","24","24"},


    BMETI311 = {"IIM","introduction to industrial management","25","25"},
            BMETI312 = {"PE-1","professional elective-1","26","31"},
            BMETI313 = {"MM","mechanical metallurgy","32","33"},
            BMETI314 = {"IM&SMT","iron making and steel making technologies","34","35"},
            BMETI315 = {"MP-1","materials processing-1","36","37"},
            BMETI316 = {"MM LAB","mechanical metallurgy lab","38","38"},
            BMETI317 = {"MP LAB","materials processing lab-1 ","39","39"},
            BMETI318 = {"F LAB","fuels lab","40","40"},


    BMETI321 = {"OE-1","open elective-1","41","44"},
            BMETI322 = {"NFEM","non ferrous extractive metallurgy","45","46"},
            BMETI323 = {"MP-2","materials processing-2","47","48"},
            BMETI324 = {"EDM","environmental degradation of materials","49","50"},
            BMETI325 = {"PE LAB-2","professional elective-2","51","57"},
            BMETI326 = {"MP LAB-2","materials processing lab-2","58","58"},
            BMETI327 = {"AC LAB","advanced communication lab","59","59"},
            BMETI328 = {"EDM LAB","environmental degradation of materials lab","60","60"},
            BMETI329 = {"IC/ITK","indian constitution/essence of indian traditional knowledge","61","61"},


    BMETI411 = {"II","introduction to instrumentation","62","63"},
            BMETI412 = {"MCT","material characterization techniques","64","65"},
            BMETI413 = {"OE-2","open elective-2","66","69"},
            BMETI414 = {"PE-3","professional elective-3","70","75"},
            BMETI415 = {"PE-4","professional elective-4","76","81"},


    BMETI421 = {"OE-3","open elective-3","85","88"},
            BMETI422 = {"PE-5","professional elective-5","89","94"},
            BMETI423 = {"PE-6","professional elective-6","95","100"};






    //------------Year Sem List Goes Here------------------//
    public static String[][] BECE21 ={ECE211,ECE212,ECE213,ECE214,ECE215,ECE216,ECE217,ECE218,ECE219},
            BECE22={ECE221,ECE222,ECE223,ECE224,ECE225,ECE226,ECE227,ECE228,ECE229},
            BECE31={ECE311,ECE312,ECE313,ECE314,ECE315,ECE316,ECE317,ECE318},
            BECE32={ECE321,ECE322,ECE323,ECE324,ECE325,ECE326,ECE327,ECE328},
            BECE41={ECE411,ECE412,ECE413,ECE414,ECE415,ECE416,ECE417},
            BECE42={ECE421,ECE422};

}
