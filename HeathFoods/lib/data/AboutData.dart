import 'package:seabird.goutfood/models/DataInfo.dart';

class AboutData {
  static Map<String, DataInfo> aboutData = {
    'What is gout?': DataInfo([
      Info(
          'Gout is a type of arthritis. It is caused by having too much of thechemical, uric acid, in your bloodstream. Uric acid is the wasteproduct created when the body breaks down purines (a type ofprotein found in many foods and all of your cells). Increased levelsof uric acid in your blood may occur if, for example, your kidneyscannot efficiently remove it, you have a rare genetic abnormality, orbecause your diet and lifestyle increase the amount of uric acid thatyou produce. If levels of uric acid are high for prolonged periods,needle-like crystals can start to form in your tissues, resulting inswollen, painful joints.'),
      Info(
          'Your diet plays an important role in both causing gout and reducingthe likelihood of suffering further painful attacks of gout. If youalready suffer from gout, eating a diet that is rich in purines canresult in a five-fold increase in gout attacks.')
    ]),
    'Are other illnesses associated with thedevelopment of gout?': DataInfo([
      Info(
          'Elevated uric acid is seen in many other conditions, and people whohave gout may also have raised cholesterol, raised triglycerides (atype of fat in your blood), high blood pressure and poor glucosetolerance. This may make it more likely that you have (or willdevelop) type 2 diabetes, metabolic syndrome and kidney disease.In addition, approximately half of all gout sufferers are overweight. '),
      Info(
          'Central obesity (carrying weight around your middle) also increasescertain inflammatory substances in your blood. This can furtherexacerbate gout attacks, as well as putting you at risk of developingheart disease, diabetes and metabolic syndrome.')
    ]),
    'Can losing weight help my gout?': DataInfo([
      Info(
          'Losing weight alone can reduce blood uric acid levels, and the numberof acute attacks suffered. Weight-loss will also help to reduce the stresson weight–bearing joints e.g. hips, knees, ankles and feet. However, it isimportant to avoid any type of crash dieting, as going without food forlong periods and rapid loss of weight can increase uric acid levels andtrigger painful gout attacks. A combination of balanced healthy eatingand regular physical activity is the best way to lose weight safely andmaintain a healthy weight.')
    ]),
    'Which foods should be avoided?': DataInfo([
      Info(
          'As uric acid is made in the body from the breakdown of purines thatcome from your diet, it is advisable to reduce the amounts of foodsthat you eat that are high purines.'),
      Info('High purine foods include: (avoid)', smallInfos: [
        'Offal- liver and kidneys, heart and sweetbreads',
        'Game- pheasant, rabbit, venison',
        'Oily fish- anchovies, herring, mackerel, sardines, sprats, whitebait,trout',
        'Seafood- especially mussels, crab, shrimps and other shellfish, fishroe, caviar',
        'Meat and Yeast Extracts- Marmite, Bovril, commercial gravy aswell as beer'
      ]),
      Info('Moderate purine foods (eat in moderation)', smallInfos: [
        'Meat- beef, lamb chicken, pork',
        'Poultry- chicken and duck',
        'Dried peas, beans and legumes- baked beans, kidney beans,soya beans and peas etc',
        'Mushrooms and mycoprotein(Quorn™',
        'Some vegetables- asparagus, cauliflower, spinach',
        'Wholegrains- bran, oatbran,wholemeal bread'
      ]),
      Info('Low purine foods', smallInfos: [
        'Dairy- milk, cheese, yoghurt, butter',
        'Eggs',
        'Bread and cereals- (except wholegrain)',
        'Pasta and noodles',
        'Fruit and vegetables(see moderate uric list)'
      ])
    ]),
    'How much protein do you need?': DataInfo([
      Info(
          'Generally you need about 1g of protein per kg of body weight (70kgman only requires 70g of protein daily), unless you on a proteinrestricted diet e.g., some people with kidney disease may need torestrict their intake.'),
      Info('Here are some examples of protein content of food:', smallInfos: [
        '100g (3.5oz) chicken breast contains 22g protein',
        '100g cod fillet contains 21g protein',
        'Large egg contains 6g',
        '30g (1oz) hard cheese contains 8g protein',
        '30g cottage cheese contains 14g protein',
        '30g almonds contain 5g protein'
      ]),
      Info(
          'Protein is very important part of your diet, it used for growth andrepair, as well as an energy source. Not only that, but eatingsufficient protein improves satiety (how full you feel) as well asblood sugar control. '),
      Info(
          'However, as its important to use high purine/moderate proteinfoods with caution, then you are best to combine both animal andvegetarian sources of protein. Studies have shown that vegetariandiets that are high in purines (e.g. from lentils etc.) are much lesslikely to lead to gout.'),
      Info(
          'In addition, red meat is a very good source of iron and is easilyabsorbed by the body. Other foods such as eggs and pulses containiron, but in a form that the body finds hard to absorb. However, theabsorption of iron can be improved if you also eat vitamin C - richfoods in the same meal e.g., add green and red peppers toscrambled eggs.'),
      Info(
          'Some people find that certain foods such as strawberries, oranges,tomatoes and nuts will trigger their gout even though they are nothigh in purines. Although there is no clear evidence to suggestwhy this happens, it is probably best to avoid them if you havehad this experience.')
    ]),
    'Are there any foods that are good for gout?': DataInfo([
      Info(
          'tudies have shown that men whose diet is higher in vitamin C areless likely to develop gout. Also, taking additional vitamin C as adietary supplement (500 to 1500mg/day) can reduce blood uricacid levels.This is achieved by helping to remove uric acid from thebody via the kidneys. If you’re considering supplementing your diet,always discuss this with your doctor as vitamin C can (rarely)interact with prescribed medications. High doses of vitamin C canalso cause loose stools in some people.'),
      Info(
          'Sour cherries or sour cherry juice have been used as a naturalremedy for gout - and scientific research has shown that a certaintype of cherry can reduce blood uric acid levels as well as reducethe inflammation that occurs with gout.')
    ]),
    'Eating healthily is key': DataInfo([
      Info(
          'Eating a balanced diet is important for everyone. A healthy diethelps to control weight and provides all the necessary nutrientsneeded for maintaining good health. A variety of foods from thefour main food groups should be eaten every day, this means:',
          smallInfos: [
            'Plenty of fruit and vegetables– it’s very important to achieve atleast 5-a-day, as fruit and vegetables provide fibre, vitamins, mineralsand phytonutrients essential for good health',
            'Plenty of bread, other cereals and potatoes– try to eat somewhole grains, and use the skin on potatoes to ensure you get thevitamins, mineral and fibre you need',
            'Moderate amounts of meat, fish and alternatives– avoideating large portions – beware restaurants often serve 8oz of meatfor a main',
            'Moderate amounts of dairy products– the recommendedamount is three portions of dairy products daily e.g. 200 ml glass of milk,a pot of yoghurt and a 30 mg (matchbox-sized) piece of hard cheese',
            'Reduce or eliminate highly processed foods and drinks'
          ])
    ]),
    'Beware sweetened foods and beverages': DataInfo([
      Info(
          'Foods and drinks sweetened with fructose (often seen labelled asglucose-fructose syrup or corn syrup), as well as sweetened softdrinks, increase the risk of developing gout, as well as the numbergout attacks.'),
      Info(
          'Sweetened soft drinks, and many commercial fruit juices (especiallythose from concentrate), are a poor substitute for fruit, as they donot contain any fibre, and are effectively ‘empty- calories’.'),
      Info(
          'Also be careful buying jams and sweetened condiments. Manymanufacturers are now using glucose-fructose syrup (also known ashigh fructose corn syrup), as it is cheaper than cane or beet sugar.'),
      Info(
          'Diets that are high in refined (easily digested) carbohydrates forexample, white bread, white pasta, white rice, biscuits and cakes,also increase the risk of developing type 2 diabetes, and are linkedto obesity'),
      Info(
          'Therefore, try to avoid sweetened soft drinks, and reduce theamount of sugar in your diet other than fresh fruit.')
    ]),
    'Can I drink alcohol?': DataInfo([
      Info(
          'Drinking alcohol can increase your risk of developing gout and canbring on a sudden attack if you are already a gout sufferer. Alcoholcan raise the level of uric acid in the blood in a number of ways andso trigger a gout attack. Many beers contain large quantities of purines from the fermenting process and alcohol stimulates theproduction of uric acid by the liver. More importantly, however,alcohol is converted in the body to lactic acid which interferes withthe removal of uric acid from the body by the kidneys.'),
      Info(
          'While it is certainly possible for people with gout to remain wellwithout becoming teetotal, reduction in alcohol consumption is veryimportant particularly if you are drinking more than therecommended healthy limit of 21 units per week for men or 14units per week for women.'),
      Info('1 unit of alcohol is provided by:', smallInfos: [
        '½ pint of standard strength (3-4% alcohol by volume) beer, lager orcider',
        '125ml glass of wine (11%, 100ml glass of stronger wine)',
        'Single measure of spirits (25ml)',
        'Single measure of sherry or fortified wine (50ml)'
      ])
    ]),
    'Are some types of alcohol better than others?': DataInfo([
      Info(
          'A study has shown that the risk of developing gout is greater in evenmoderate regular beer drinkers than in those who drink equivalentamounts of alcohol in the form of spirits or wine. Gout was two anda half times more frequent in men who drink two bottles of beer aday while two glasses of wine daily was not associated with anincreased risk of developing gout.')
    ]),
    'What about reduced alcohol beer?': DataInfo([
      Info(
          'We are not aware of any specific studies with low alcohol beers butit seems probable that they are less likely to cause gout. ')
    ]),
    'Is there a link between gout and binge drinking?': DataInfo([
      Info(
          'Some people say that their gout attacks follow quickly after a heavydrinking session. Indeed, it is well established that binge drinkingmay trigger attacks in people who suffer with gout, even when theyare taking medicines to prevent them.')
    ]),
    'Should I drink lots of water?': DataInfo([
      Info(
          'Yes, drinking fluids reduces the likelihood of crystals forming in thekidneys. As a general rule, drinking 8 large glasses of fluids a day (1.5litres) is recommended. All drinks, except alcohol, count towardsyour fluid intake, including caffeine-containing drinks such as tea andcoffee. Caffeine can act as a mild diuretic, which means it causes youto pass urine more often. However, regular tea and coffee drinkersdevelop a natural tolerance to caffeine and will only experience milddehydration if they consume more than their usual amount. Caffeineitself may have no direct influence on the risk of developing gout, asresearch has shown that coffee intake, but not tea, may in somepeople be associated with slightly lower blood levels of uric acid thanthose drinking the same volumes of tea.')
    ]),
  };
}
