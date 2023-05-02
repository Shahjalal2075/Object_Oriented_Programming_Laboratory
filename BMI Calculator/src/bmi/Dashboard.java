package bmi;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Dashboard extends javax.swing.JFrame {
    
    public double bmi=0.0;
    
    public Dashboard() {
        initComponents();
        init();
    }
    
    public void init()
    {
        bmiImage();
        foodList();
        jButtonHealthTips.setEnabled(false);
    }
    
    public void clear()
    {
        jTextFieldHeightFeet.setText("");
        jTextFieldHeightInch.setText("");
        jTextFieldWeightKg.setText("");
        jLabelBMI.setText("");
        jLabelCategory.setText("");
        jLabelCalorie.setText("");
        bmi=0;
        foodList();
        jButtonHealthTips.setEnabled(false);
    }
    
    public void bmiCategory()
    {
        if(bmi<18.5)
        {
            jLabelCategory.setText("You are Underweight.");
        }
        else if(bmi<25)
        {
            jLabelCategory.setText("You are Normal.");
        }
        else if(bmi<30)
        {
            jLabelCategory.setText("You are Overweight.");
        }
        else if(bmi<35)
        {
            jLabelCategory.setText("You are Obese.");
        }
        else
        {
            jLabelCategory.setText("You are Extremely Obese.");
        }
        
        jLabelCalorie.setText("Check out following health tips to normalize your health.");
    }
    
    public void foodList()
    {
        jTextAreaFoodlist.setText("   Food Item                         Quantity                         Calorie\n\n" +
                                "   Apple Juice                       ½ cup                              50\n" +
                                "   Banana                              1 medium size                100\n" +
                                "   Barley                               30 grams                         35\n" +
                                "   Beans                                ½ cup                              12\n" +
                                "   Biscuit (arrowroot             1                                     20\n" +
                                "   Bread (whole wheat)         1 slice                             55\n" +
                                "   Broccoli                             ½ cup                              12\n" +
                                "   Butter Milk                       1 cup                               85\n" +
                                "   Cabbage                             ½ cup                             12\n" +
                                "   Celery                                ½ cup                              12\n" +
                                "   Chapatti                             1 medium                       100\n" +
                                "   Carrot                                1 medium                        15\n" +
                                "   Chicken (boiled)                ½ medium                      100\n" +
                                "   Chicken Leg roast             1 helping                        90\n" +
                                "   Chicken Sandwich              1                                     275\n" +
                                "   Chicken Soup                     1 cup                              80\n" +
                                "   Chicken Thigh Roast         1 helping                        95\n" +
                                "   Chili Sauce                         1 table spoon                 20\n" +
                                "   Chowmin                             ½ cup                             150\n" +
                                "   Coffee (black)                    1 cup                              12\n" +
                                "   Corn flakes                        1 cup                              100\n" +
                                "   Cucumber (raw)                30 grams                         3\n" +
                                "   Custard with powder         30 grams                        32\n" +
                                "   Egg                                     1 medium                       75\n" +
                                "   Egg Plant                           ½ cup                              25\n" +
                                "   Egg Sandwich                     1                                    265\n" +
                                "   Egg Yolk                             1                                     50\n" +
                                "   Garlic                                  1 clove                            2\n" +
                                "   Guava                                 1 medium                       50\n" +
                                "   Honey                                 1 table spoon                 25\n" +
                                "   Indian Tea (raw)                 1 cup                              0\n" +
                                "   Jam & Jelly                        1 table spoon                 50\n" +
                                "   Lemon                                 1 whole                          4\n"+
                                "   Lemon Juice                     30  grams                        2\n" +
                                "   Lemonade                         1 ounce                           6\n" +
                                "   Lentils                               1 helping                         30\n" +
                                "   Lettuce                              100 grams                      11\n" +
                                "   Melon                                1 ounce                           7\n" +
                                "   Milk                                   30 grams                        19\n" +
                                "   Milk (skimmed)                30 grams                        10\n" +
                                "   Mushroom cream soup     1 cup                             100\n" +
                                "   Mustard seeds                  0                                     0\n" +
                                "   Mutton soup                      1 cup                             110\n" +
                                "   Onion (fried)                      30 grams                      101\n" +
                                "   Onion (raw, cut)                 1 table spoon                 8\n" +
                                "   Peach                                  1 medium                      35\n" +
                                "   Peas (dried)                        30 grams                       28\n" +
                                "   Peas (raw)                           30 grams                      12\n" +
                                "   Peer                                     1                                   50\n" +
                                "   Pine apple                           1 slice                           50\n"+
                                "   Pop corn                             1 cup                              75\n" +
                                "   Potato (boiled)                   1 medium                       100\n" +
                                "   Potato (fried)                     1 medium                       200\n" +
                                "   Prawn                                 30grams                         30\n" +
                                "   Raw Apple                         1                                      35\n" +
                                "   Rice (boiled)                      1 helping                        200\n" +
                                "   Soya Beans                        ½ cup                             108\n" +
                                "   Spaghetti                            30 grams                        104\n" +
                                "   Straw berries                      1 cup                              55\n" +
                                "   Sugar                                   30 grams                        112\n" +
                                "   Tea (milk & Sugar)            1 cup                               26\n" +
                                "   Tea without sugar               1 cup                               10\n" +
                                "   Tomato                                1                                      25\n" +
                                "   Tomato Sauce                     1 table spoon	                25\n" +
                                "   Tomato soup                       1 cup                              100\n" +
                                "   Vegetable Oil                      1 table spoon	              110\n" +
                                "   Vegetable Sandwich           1                                     167\n" +
                                "   Vegetable soup                   1 cup                              100\n" +
                                "   Wheat Flower                     30 grams                        100\n"+
                                ""
                
        );
    }
    
    public void healthTips()
    {
        if(bmi<=0.00)
        {
            jTextAreaFoodlist.setText("");
        }
        else if(bmi<18.5)
        {
            jTextAreaFoodlist.setText("\n"+
                    "1. Increase your calorie intake: The most important thing \nfor gaining weight is to consume more calories than you \nburn. You can calculate your daily calorie needs using an \nonline calorie calculator and aim to eat around 500-1000 \ncalories more than that per day.\n\n" +
                    
                    "2. Eat nutrient-dense foods: Focus on consuming foods that \nare high in nutrients and calories, such as nuts, dried fruits, \nwhole grains, and healthy fats like avocado and olive oil.\n\n" +
                    
                    "3. Eat frequently: Eating frequent, smaller meals \nthroughout the day can help you consume more calories \nwithout feeling too full.\n\n" +
                    
                    "4. Incorporate strength training: Lifting weights or doing \nresistance training can help build muscle mass, which can \nlead to weight gain.\n\n" +
                    
                    "5. Get enough sleep: Adequate sleep is essential for \nmuscle recovery and growth, which can help you gain \nweight.\n\n" +
                    
                    "6. Avoid unhealthy foods: While it's important to consume \nmore calories, it's important to choose nutrient-dense \nfoods rather than junk food or processed foods, which can \nbe high in calories but low in nutrients.\n\n" +
                    
                    "7. Consult with a dietitian: If you're struggling to gain \nweight, consider working with a dietitian who can help \nyou develop a healthy and balanced meal plan.\n\n");
        }
        else if(bmi<25)
        {
            jTextAreaFoodlist.setText("\n"+
                    "1. Eat a balanced diet: Consuming a variety of nutrient-dense \nfoods, including fruits, vegetables, whole grains, lean proteins, \nand healthy fats, can help you maintain a healthy weight and \nsupport overall health.\n\n" +
                    
                    "2. Control portion sizes: Paying attention to portion sizes can \nhelp prevent overeating and promote weight maintenance.\n\n" +
                    
                    "3. Stay active: Regular physical activity is important for \nmaintaining a healthy weight and can also provide numerous \nhealth benefits. Aim for at least 30 minutes of moderate-\nintensity exercise most days of the week.\n\n" +
                    
                    "4. Stay hydrated: Drinking enough water can help you feel full \nand may also help boost your metabolism.\n\n" +
                    
                    "5. Get enough sleep: Adequate sleep is important for maintaining \na healthy weight, as sleep deprivation can disrupt hormones \nthat regulate appetite and metabolism.\n\n" +
                    
                    "6. Manage stress: Chronic stress can lead to overeating and \nweight gain. Finding ways to manage stress, such as through \nmeditation, yoga, or deep breathing, can help promote a healthy \nweight.\n\n" +
                    
                    "7. Avoid fad diets: Quick-fix diets or extreme eating plans may \nresult in short-term weight loss but are often unsustainable and \ncan lead to weight regain. Focus on making sustainable lifestyle \nchanges for long-term success.\n\n");
        }
        else if(bmi<30)
        {
            jTextAreaFoodlist.setText("\n"+
                    "1. Consult with a healthcare professional: Your healthcare \nprovider can help you determine a healthy weight for you \nbased on your age, sex, height, and other factors. They can \nalso provide guidance on healthy weight loss strategies and \nrefer you to a dietitian or other health professional as needed.\n\n" +
                    
                    "2. Make dietary changes: Consuming a balanced and calorie-\ncontrolled diet that is rich in whole foods, fruits, vegetables, \nlean proteins, and healthy fats can help you lose weight and \nimprove your overall health.\n\n" +
                    
                    "3. Increase physical activity: Regular physical activity can help \nyou burn calories and lose weight, while also providing numerous \nhealth benefits. Aim for at least 150 minutes of moderate-\nintensity exercise per week.\n\n" +
                    
                    "4. Build a support system: Having a support system of friends, \nfamily, or a weight-loss group can help you stay motivated and \naccountable.\n\n" +
                    
                    "5. Avoid fad diets: Quick-fix diets or extreme eating plans may \nresult in short-term weight loss but are often unsustainable and \ncan lead to weight regain. Focus on making sustainable \nlifestyle changes for long-term success.\n\n" +
                    
                    "6. Consider seeking counseling: Emotional eating or other \nunderlying psychological issues may be contributing to your \nweight gain. Counseling or therapy can help address these \nissues and support healthy weight loss.\n\n");
        }
        else if(bmi<35)
        {
            jTextAreaFoodlist.setText("\n"+
                    "1. Consult with a healthcare professional: Your healthcare \nprovider can help you determine a healthy weight for you \nbased on your age, sex, height, and other factors. They can \nalso provide guidance on healthy weight loss strategies and \nrefer you to a dietitian or other health professional as needed.\n\n" +
                    
                    "2. Make dietary changes: Consuming a balanced and calorie-\ncontrolled diet that is rich in whole foods, fruits, vegetables, \nlean proteins, and healthy fats can help you lose weight and \nimprove your overall health. Consider working with a \nregistered dietitian who can help you develop a personalized \nmeal plan.\n\n" +
                    
                    "3. Increase physical activity: Regular physical activity can help \nyou burn calories and lose weight, while also providing numerous \nhealth benefits. Aim for at least 150 minutes of moderate-\nintensity exercise per week.\n\n" +
                    
                    "4. Build a support system: Having a support system of friends, \nfamily, or a weight-loss group can help you stay motivated and \naccountable.\n\n" +
                    
                    "5. Consider weight-loss medication or surgery: In some cases, \nweight-loss medication or surgery may be recommended to help \nwith significant weight loss. However, these options should only \nbe considered after consultation with a healthcare provider.\n\n" +
                    
                    "6. Seek counseling: Emotional eating or other underlying \npsychological issues may be contributing to your weight gain. \nCounseling or therapy can help address these issues and \nsupport healthy weight loss.\n\n");
        }
        else
        {
            jTextAreaFoodlist.setText("\n"+
                    "1. Consult with a healthcare professional: Your healthcare\n provider can help you determine a healthy weight for you \nbased on your age, sex, height, and other factors. They can \nalso provide guidance on healthy weight loss strategies and \nrefer you to a specialist, such as a bariatric surgeon, as needed.\n\n" +
                    
                    "2. Make dietary changes: Consuming a balanced and calorie-\ncontrolled diet that is rich in whole foods, fruits, vegetables, \nlean proteins, and healthy fats can help you lose weight and \nimprove your overall health. Consider working with a \nregistered dietitian who can help you develop a personalized \nmeal plan.\n\n" +
                    
                    "3. Increase physical activity: Regular physical activity can \nhelp you burn calories and lose weight, while also providing \nnumerous health benefits. Aim for at least 150 minutes of \nmoderate-intensity exercise per week.\n\n" +
                    
                    "4. Consider weight-loss medication or surgery: In some cases, \nweight-loss medication or surgery may be recommended to help \nwith significant weight loss. However, these options should only \nbe considered after consultation with a healthcare provider.\n\n" +
                    
                    "5. Build a support system: Having a support system of friends, \nfamily, or a weight-loss group can help you stay motivated and \naccountable.\n\n" +
                    
                    "6. Seek counseling: Emotional eating or other underlying \npsychological issues may be contributing to your weight gain. \nCounseling or therapy can help address these issues and \nsupport healthy weight loss.\n\n");
        }
    }
    
    public void bmiImage()
    {
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/health.jpg"));
        
        Image img1 = icon1.getImage().getScaledInstance(jLabelhealthpic.getWidth(), jLabelhealthpic.getHeight(), Image.SCALE_SMOOTH);
        
        jLabelhealthpic.setIcon(new ImageIcon(img1));       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldHeightFeet = new javax.swing.JTextField();
        jTextFieldWeightKg = new javax.swing.JTextField();
        jTextFieldHeightInch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonBmiCalculate = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabelBMI = new javax.swing.JLabel();
        jLabelCalorie = new javax.swing.JLabel();
        jLabelCategory = new javax.swing.JLabel();
        jLabelhealthpic = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaFoodlist = new javax.swing.JTextArea();
        jButtonHealthTips = new javax.swing.JButton();
        jButtonFoodCalorie = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("      BMI Calculator");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setText("Your Height :");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Your Weight :");

        jTextFieldHeightFeet.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jTextFieldHeightFeet.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldWeightKg.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jTextFieldWeightKg.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldHeightInch.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jTextFieldHeightInch.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Inches");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("kg");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Feets");

        jButtonBmiCalculate.setBackground(new java.awt.Color(102, 255, 0));
        jButtonBmiCalculate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButtonBmiCalculate.setText("Calculate");
        jButtonBmiCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBmiCalculateActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(255, 255, 0));
        jButtonClear.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jLabelBMI.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBMI.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelBMI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelCalorie.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCalorie.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelCalorie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelCategory.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCategory.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelCategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTextAreaFoodlist.setBackground(new java.awt.Color(0, 204, 51));
        jTextAreaFoodlist.setColumns(20);
        jTextAreaFoodlist.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jTextAreaFoodlist.setRows(5);
        jScrollPane1.setViewportView(jTextAreaFoodlist);

        jButtonHealthTips.setBackground(new java.awt.Color(153, 204, 0));
        jButtonHealthTips.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButtonHealthTips.setText("Health Tips");
        jButtonHealthTips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHealthTipsActionPerformed(evt);
            }
        });

        jButtonFoodCalorie.setBackground(new java.awt.Color(214, 251, 0));
        jButtonFoodCalorie.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButtonFoodCalorie.setText("Food Calorie List");
        jButtonFoodCalorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFoodCalorieActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGap(26, 26, 26)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextFieldWeightKg, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextFieldHeightFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jButtonBmiCalculate))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextFieldHeightInch, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(62, 62, 62)
                                            .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabelhealthpic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelCalorie, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonHealthTips, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFoodCalorie, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldHeightFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldHeightInch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldWeightKg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBmiCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabelBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCalorie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabelhealthpic, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonHealthTips, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFoodCalorie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    private void jButtonBmiCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBmiCalculateActionPerformed
        
        double heightf=0,heighti=0,heightm,weightkg=0;
        heightf = Double.parseDouble(jTextFieldHeightFeet.getText());
        heighti = Double.parseDouble(jTextFieldHeightInch.getText());
        weightkg = Double.parseDouble(jTextFieldWeightKg.getText());
        
        heightm=((heightf*12)+heighti)/(39.37);
        
        bmi=weightkg/(heightm*heightm);
        
        jLabelBMI.setText("Your BMI : "+String.format("%.2f", bmi));
        bmiCategory();
        healthTips();
        jButtonHealthTips.setEnabled(true);
        
    }//GEN-LAST:event_jButtonBmiCalculateActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clear();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonFoodCalorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFoodCalorieActionPerformed
        foodList();
    }//GEN-LAST:event_jButtonFoodCalorieActionPerformed

    private void jButtonHealthTipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHealthTipsActionPerformed
        healthTips();
    }//GEN-LAST:event_jButtonHealthTipsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    int xx,xy;
    
    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBmiCalculate;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonFoodCalorie;
    private javax.swing.JButton jButtonHealthTips;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBMI;
    private javax.swing.JLabel jLabelCalorie;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelhealthpic;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaFoodlist;
    private javax.swing.JTextField jTextFieldHeightFeet;
    private javax.swing.JTextField jTextFieldHeightInch;
    private javax.swing.JTextField jTextFieldWeightKg;
    // End of variables declaration//GEN-END:variables
}
