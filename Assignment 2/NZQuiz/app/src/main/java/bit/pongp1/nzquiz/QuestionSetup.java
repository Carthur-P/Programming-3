package bit.pongp1.nzquiz;

import android.media.Image;

import java.util.ArrayList;

/**
 * Created by Carthur Pongpatimet (1000026069) on 12/06/2018.
 */
public class QuestionSetup {
    ArrayList<String> questions;
    ArrayList<String> answers;
    ArrayList<String> options;
    ArrayList<String> title;
    ArrayList<String> info;
    int[] imageID;

    /**
     * Constructor
     */
    public QuestionSetup()
    {
        questions = new ArrayList<String>();
        answers = new ArrayList<String>();
        options = new ArrayList<String>();
        title = new ArrayList<String>();
        info = new ArrayList<String>();
        imageID = new int[10];
        createQuestion();
        createAnswer();
        createOption();
        createTitle();
        createInfo();
        createImages();
    }

    /**
     * @return question This returns the questions array list
     */
    public ArrayList<String> getQuestions() {
        return questions;
    }

    /**
     * @param questions
     */
    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }

    /**
     * @return answers This returns the answers array list
     */
    public ArrayList<String> getAnswers() {
        return answers;
    }

    /**
     * @param answers
     */
    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    /**
     * @return options This returns the options array list
     */
    public ArrayList<String> getOptions() {
        return options;
    }

    /**
     * @param options
     */
    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    /**
     * @return title This returns the title array list
     */
    public ArrayList<String> getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(ArrayList<String> title) {
        this.title = title;
    }

    /**
     * @return info This returns the info array list
     */
    public ArrayList<String> getInfo() {
        return info;
    }

    /**
     * @param info
     */
    public void setInfo(ArrayList<String> info) {
        this.info = info;
    }

    /**
     * @return imageID This returns the imageID array
     */
    public int[] getImageID() {
        return imageID;
    }

    /**
     * @param imageID
     */
    public void setImageID(int[] imageID) {
        this.imageID = imageID;
    }

    /**
     * @return String This returns all the fields in the class as a string
     */
    @Override
    public String toString() {
        return "QuestionSetup{" +
                "questions=" + questions +
                ", answers=" + answers +
                ", options=" + options +
                ", title=" + title +
                ", info=" + info +
                '}';
    }

    /**
     * Populate the questions array list with questions
     */
    public void createQuestion()
    {
        questions.add("Which town does the Waikato River runs through");
        questions.add("What town has the motto \"Timaz Hard\" ");
        questions.add("In what town can you find the steepest street in the world?");
        questions.add("Which New Zealand city has the highest population?");
        questions.add("What is the capital city of New Zealand?");
        questions.add("Where is the longest road bridge in New Zealand?");
        questions.add("Where would you find Waitaki Boys High School?");
        questions.add("What is the name of a small town in the far north where a song was written about a local dolphin in 1956 that shares its name with this town?");
        questions.add("What is the name of the largest inland city in New Zealand?");
        questions.add("What city was the home of Sir Ernest Rutherford, the scientist who first \"split the atom\"?");
    }

    /**
     * Populate the answers array list with answers to the questions
     */
    public void createAnswer()
    {
        answers.add("Hamilton");
        answers.add("Timaru");
        answers.add("Dunedin");
        answers.add("Auckland");
        answers.add("Wellington");
        answers.add("Rakaia");
        answers.add("Oamaru");
        answers.add("Opononi");
        answers.add("Hamilton");
        answers.add("Nelson");
    }

    /**
     * Populate the options array list with other answer options that the user can select
     */
    public void createOption()
    {
        options.add("Christchurch");
        options.add("Palmerston North");
        options.add("Kapiti Coast");
        options.add("Rotorua");
        options.add("Whangarei");
        options.add("Gisborne");
        options.add("Temuka");
        options.add("Gore");
        options.add("Waimate");
        options.add("Tauranga");
    }

    /**
     * Populate the title array list with more info dialog box title
     */
    public void createTitle()
    {
        title.add("Waikato River");
        title.add("Timaru");
        title.add("Baldwin Street");
        title.add("Auckland");
        title.add("Wellington");
        title.add("Rakaia Bridge");
        title.add("Oamaru");
        title.add("Opononi");
        title.add("Hamilton");
        title.add("Nelson");
    }

    /**
     * Populate the info array list with infomation displayed in the more info dialog boc
     */
    public void createInfo()
    {
        info.add("The Waikato River is the longest river in New Zealand, running for 425 kilometres through the North Island. It rises in the eastern slopes of Mount Ruapehu, joining the Tongariro River system and flowing through Lake Taupo, New Zealand's largest lake. It then drains Taupo at the lake's northeastern edge, creates the Huka Falls, and flows northwest through the Waikato Plains. It empties into the Tasman Sea south of Auckland, at Port Waikato. It gives its name to the Waikato Region that surrounds the Waikato Plains. The present course of the river was largely formed about 17,000 years ago.");
        info.add("Timaru is a port city in the southern Canterbury region of New Zealand, located 157 kilometres southwest of Christchurch and about 196 kilometres northeast of Dunedin on the eastern Pacific coast of the South Island. The Timaru urban area is home to 29,000 people, and is the largest urban area in South Canterbury, and the second largest in the Canterbury Region overall, after Christchurch. The city is the seat of the Timaru District, which includes the surrounding rural area and the towns of Geraldine, Pleasant Point and Temuka, which combined has a total population of 47,100.");
        info.add("Baldwin Street, in Dunedin, New Zealand is the world's steepest residential street, according to Guinness World Records. It is located in the residential suburb of North East Valley, 3.5 kilometres northeast of Dunedin's central business district. A short straight street a little under 350 metres long, Baldwin Street runs east from the valley of the Lindsay Creek up the side of Signal Hill towards Opoho, rising from 30 m above sea level at its junction with North Road to 100 m above sea level at the top, an average slope of slightly more than 1:5. Its lower reaches are only moderately steep, and the surface is asphalt, but the upper reaches of this cul-de-sac are far steeper and surfaced in concrete for ease of maintenance (bitumen—in either chip seal or asphalt—would flow down the slope on a warm day) and for safety in Dunedin's frosty winters.");
        info.add("Auckland is a city in New Zealand's North Island. Auckland is the largest urban area in the country, with an urban population of around 1,534,700. It is located in the Auckland Region—the area governed by Auckland Council—which includes outlying rural areas and the islands of the Hauraki Gulf, resulting in a total population of 1,657,200. A diverse and multicultural city, Auckland is home to the largest Polynesian population in the world.");
        info.add("Wellington is the capital city and second most populous urban area of New Zealand, with 412,500 residents. It is located at the south-western tip of the North Island, between Cook Strait and the Rimutaka Range. Wellington is the major population centre of the southern North Island and is the administrative centre of the Wellington Region, which also includes the Kapiti Coast and Wairarapa. It is the world's southernmost capital of a sovereign state. Wellington features a temperate maritime climate and is the world's windiest city, with an average wind speed of over 26 km/h.");
        info.add("The Rakaia Bridge is New Zealand's longest road bridge and crosses the Rakaia River, one of Canterbury's large braided rivers. The present bridge was opened in 1939 and replaced an earlier combined road and rail bridge from 1873. The present road bridge is just downstream from the rail bridge and forms part of State Highway 1.");
        info.add("Oamaru is the largest town in North Otago, in the South Island of New Zealand, it is the main town in the Waitaki District. It is 80 kilometres south of Timaru and 120 kilometres north of Dunedin on the Pacific coast; State Highway 1 and the railway Main South Line connect it to both cities. With a population of 13,900, Oamaru is the 28th largest urban area in New Zealand, and the third largest in Otago behind Dunedin and Queenstown.");
        info.add("In 1955, a dolphin swam into Opononi, a small bay township in the Hokianga Harbour north of Auckland, and adopted the people of Opononi as her family. Named Opo for the town, she became famous, first with the local community, then with tourists, and finally with the whole of New Zealand. She interacted well with everyone she came in contact with. One 13 yr old girl formed a very close friendship with the dolphin. Opo would tow Jill around the bay, and Jill would teach Opo tricks. Opo loved small children but seemed to know how fragile they were. She was known for her gentleness.");
        info.add("Hamilton is a city in the North Island of New Zealand. It is the seat and most populous city of the Waikato region, with a territorial population of 165,400, the country's fourth most-populous city. Encompassing a land area of about 110 km2 on the banks of the Waikato River, Hamilton is part of the wider Hamilton Urban Area, which also encompasses the nearby towns of Ngaruawahia, Te Awamutu and Cambridge. The area now covered by the city was originally the site of a handful of Maori villages, including Kirikiriroa, from which the city takes its Maori name. By the time English settlers arrived, most of these villages, which sat beside the Waikato River, were abandoned. The new English settlement was renamed Hamilton after Captain John Fane Charles Hamilton, the commander of HMS Esk, who was killed in the Battle of Gate Pa, Tauranga.");
        info.add("Nelson is a city on the eastern shores of Tasman Bay. Nelson is the oldest city in the South Island and the second-oldest settled city in New Zealand – it was established in 1841 and was proclaimed a city by royal charter in 1858. Nelson city is bordered to the west and south-west by the Tasman District Council and the north-east, east and south-east by the Marlborough District Council. The city does not include Richmond, the area's second-largest settlement. Nelson City has a population of around 50,000, making it New Zealand's 12th most populous city and the geographical centre of New Zealand. When combined with the town of Richmond which has close to 14,000 residents, Nelson is ranked as New Zealand's 9th largest urban area by population. Nelson is well known for its thriving local arts and crafts scene, Each year, the city hosts events popular with locals and tourists alike, such as the Nelson Arts Festival");
    }

    /**
     * Populate the imageId array with image IDs from the drawable resource
     */
    public void createImages()
    {
        imageID[0] = R.drawable.waikato_river;
        imageID[1] = R.drawable.timaru;
        imageID[2] = R.drawable.baldwin_street;
        imageID[3] = R.drawable.auckland;
        imageID[4] = R.drawable.wellington;
        imageID[5] = R.drawable.rakaia;
        imageID[6] = R.drawable.oamaru;
        imageID[7] = R.drawable.opononi;
        imageID[8] = R.drawable.hamilton;
        imageID[9] = R.drawable.nelson;
    }
}
