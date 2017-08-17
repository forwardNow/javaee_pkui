define( function ( require ) {
    var
        IDValidator = require( "./IDValidator" ),
        idCodeList = [ "001230199001011125", "099008201601019986", "100001199010041545", "101010198005197193", "101010198505197130", "101010198605010003", "101010198605111111", "101010198605197154", "101010199405177196", "101010199405187183", "101010199405197154", "101010199405197197", "101020199105197198", "101020199305197184", "101021199105187180", "101021199405197196", "101023199105117185", "101123198810122626", "101123199505051213", "101123199810241152", "101124199901011156", "101125198809091247", "101213199401197288", "101213199401197288", "101918199401072872", "102030199103061717", "110002199909040418", "110101198910058425", "110220101101019902", "110220199101019900", "110220199807061190", "110220201010100017", "110220201101017788", "110220201101090037", "110220201109097700", "110220201601117785", "110220201602029904", "110222201010100941", "110231198910056810", "110990199101018892", "110990199109091189", "110990201101018892", "110990201101019908", "110990201601016666", "110990201601017781", "110990201601018899", "110999199101087705", "110999201601018896", "111111111111111110", "111111199010100008", "111111199811111110", "111111199902030009", "111111201501011114", "111111201601010039", "111114201601050013", "111222201201236981", "111222201601012223", "111222201601017788", "111414198911052657", "111999201601018897", "114141198910056213", "119009201501018893", "119990201601012225", "121212199201072875", "12121219940107287X", "121314199501072875", "122345199401072873", "122514201501269848", "123000201601017782", "123100201601019994", "123122201601017786", "123122201601019984", "123123000001020004", "123123199009086789", "123123199012042146", "123123199012054550", "123123199410103338", "123123201601015795", "12312320160101889X", "123132199012054127", "123156189202051543", "123201201101239853", "123222201601018899", "123321201201269858", "123321201501239693", "123321201501249867", "12332120150126985X", "12332120150126985X", "123338201501019903", "123421199012058758", "12342119901209234X", "123421199201032450", "123422199010096757", "123423199102131245", "123451199301024560", "123456190101112196", "12345619070909888X", "123456190908081116", "123456190909098884", "123456190909099924", "12345619900909888X", "123456199301022786", "123456199808087781", "123456201301013353", "123457190901011234", "123567190909098889", "123890199809090004", "124121199012054567", "124151199012051241", "124511199210230217", "12678920160101889X", "12678920160101889X", "130628198805204225", "13123119901201145X", "141234199012054565", "141411198910056812", "151313199012054560", "151514198512012140", "154111198910056845", "154154199901022154", "156768199609098883", "165131199012045645", "200110201101012227", "200300201601019976", "201111199609010094", "201501201501239654", "202010199405197191", "202020199105197184", "202020199405197194", "202030199405197197", "20204019940519719X", "202050199405197192", "212121111111111118", "212201201501239650", "212322201601017788", "214111198810052122", "220220196101019902", "220220199109018801", "220222201109090080", "220330201101019912", "220990201101010095", "220990201101019903", "222000199001010096", "22222220140801002X", "222333199101010097", "222333199109010825", "223889199001080098", "225123201201239656", "229008199601019905", "23423419901205456X", "234563199503022341", "242142199010012344", "24312419901203123X", "245678199809098886", "254811199301021520", "32111420120123965X", "321123201101239659", "330330201101010091", "333333201101010093", "333444201101010098", "354235199012052541", "354536199401072872", "420325199208124516", "42032519981202102X", "420325199902151215", "420325200112031214", "420325200512032144", "420325201203151208", "420583198907282855", "420583198907284711", "42058319890728472X", "420583199007282619", "420583199008292341", "420583199008292683", "420583199008292835", "420583199008293635", "421123199001295614", "421123199203302122", "421123201503121219", "421123201503129560", "421125201501249879", "421126201301259681", "421126201303289665", "421126201309063528", "421126201501231261", "421126201501236986", "421126201501239650", "421126201501239685", "421126201501239853", "421126201501248960", "421126201501249656", "421126201501249680", "421126201501259862", "421126201501263693", "421126201501269358", "42112620150126985X", "421126201501269868", "421126201501289631", "421126201501289658", "421126201501296583", "421126201502126391", "421126201502129680", "421126201502149630", "421126201502165470", "421126201502169228", "421126201502169682", "421126201502169877", "421126201502169914", "421126201503189650", "421126201503219688", "42112620150529741X", "421126201508059628", "421126201508059652", "422126201501236549", "424212199301021235", "428099199809095672", "42900119910901067X", "429001201509010679", "429006198709085672", "429006199107178884", "429006199109010006", "429006199109010022", "42900619910901009X", "429006199208076676", "429006199209010249", "429006199209080001", "429006199209099992", "42900619960102002X", "429006199609010619", "429006199609010619", "429006199609010619", "429006199609010619", "429006199609010619", "429006199609010619", "429006199609010619", "429006199609098884", "429006199809099996", "429006199909018882", "429006200009097779", "429006201507181118", "429006201509017899", "429006201509097788", "429006201509099994", "429006201601012222", "429006201601059995", "429007199109012227", "429008201509097780", "432231190809098880", "444444201601018893", "451241199012054561", "451245199612056152", "45648619991229784X", "456789201109018878", "457544199012054562", "484511198512052361", "490889201501018829", "500224198609090306", "500224198609090322", "500224198609090330", "510101199001017131", "51010119900519715X", "510101199005197184", "510101199005197192", "51010119910519719X", "510101199205197197", "510101199405197175", "510102195803024083", "510102198409121233", "510102198909140406", "510102198909140422", "510104188401010022", "510104198402050017", "510104198412050010", "510104198412050109", "510104198412120015", "510104198708224067", "510104198808230026", "510104199007300017", "510104199008060019", "510104199008067640", "510104199009145938", "510104199012050024", "510104199108040023", "510104199108060016", "510104199108060016", "510104199110100013", "510104199909092341", "510104200011213763", "510104200301050026", "510104201003010012", "510104201301052157", "510104201401020013", "510104201410200016", "510104201410201123", "510104201411200018", "510104201501240152", "510104201506051246", "510104201507220013", "510104201507230019", "510104201507240014", "51010420150725001X", "510104201507250028", "510104201507260015", "510104201507270029", "510104201507280016", "510104201508010018", "510104201508010018", "510104201508010026", "510104201508010034", "510104201508010050", "510104201508010050", "510104201508010050", "510104201509160018", "510104201509160026", "510104201509160034", "510104201509160069", "510104201509160085", "510104201509170013", "510104201509170021", "510104201510130027", "510104201510130043", "510104201512220018", "510104201603010024", "510104201603310019", "51010420160616001X", "510104201606260010", "510104201607310016", "510104201607310032", "510104201607310059", "510104201607310067", "510104201607310075", "510104201607310091", "510104201608020010", "510104201608040011", "510104201608040038", "510104201610010014", "510105198909140413", "510105199102140038", "510105199102160231", "51010520160808001X", "510105201608110012", "510105201611010012", "51010520161111003X", "510107188912050017", "510107193701010011", "510107197511120015", "510107198105190020", "510107198110080010", "510107198112010016", "510107198112010032", "510107198112020011", "510107198201010018", "510107198210190014", "510107198302010017", "510107198302120013", "51010719841010001X", "510107198501060017", "510107198504050025", "510107198512030016", "510107198512030016", "510107198512030016", "510107198512030016", "510107198512030016", "510107198512200011", "510107198712050011", "510107198802120028", "510107198804110034", "510107198909090017", "510107198910050012", "510107198910050020", "510107198910050039", "510107198910050055", "510107198910050071", "510107198910050098", "510107198910050119", "510107198910050135", "510107198910050151", "510107198910050194", "510107198910260028", "510107198912050016", "510107199001010018", "510107199001010026", "510107199001010034", "510107199001010042", "510107199001010050", "510107199001010069", "510107199001010077", "510107199001010085", "510107199001010093", "510107199001010106", "510107199001010114", "510107199001010122", "510107199001010149", "510107199001010173", "510107199001010181", "51010719900101019X", "51010719900101019X", "510107199001010210", "510107199001010237", "510107199001010296", "510107199001010317", "51010719900101035X", "510107199001010376", "510107199001010392", "510107199001010413", "51010719900101043X", "510107199001010472", "51010719900101051X", "510107199001010536", "510107199001010552", "510107199001010579", "510107199001010587", "510107199001010595", "510107199001010616", "510107199001010659", "510107199001010675", "510107199001010691", "510107199001011117", "510107199001015652", "510107199001023118", "510107199001030019", "510107199001301229", "51010719900131111X", "51010719900519001X", "510107199005190036", "510107199008290016", "510107199008290024", "510107199008290024", "510107199009090024", "510107199009090075", "510107199009090091", "510107199009090112", "510107199009090112", "510107199009090139", "510107199009091115", "510107199009094228", "510107199010090013", "510107199010100023", "510107199010160026", "510107199012030014", "510107199012050015", "510107199012050023", "510107199012050031", "510107199012050058", "510107199012050066", "510107199012050074", "510107199012050090", "510107199012050103", "510107199012050111", "51010719901205012X", "510107199012050138", "510107199012050162", "510107199012050189", "51010719901205020X", "510107199012050218", "510107199012050226", "510107199012050234", "510107199012050250", "510107199012050277", "510107199012050330", "510107199012050357", "510107199012050373", "51010719901205039X", "510107199012050410", "510107199012050437", "510107199012050533", "510107199012051210", "510107199012051237", "510107199101010015", "510107199105190017", "510107199105190033", "510107199105190041", "510107199105191116", "510107199108070037", "510107199112010010", "510107199112050012", "510107199112051234", "510107199201010039", "510107199201010119", "510107199201010135", "510107199201010151", "510107199201010178", "510107199201010194", "510107199201010215", "510107199201020018", "510107199201020034", "510107199201020050", "510107199201020077", "510107199202010014", "510107199202020095", "510107199202120029", "510107199203230078", "510107199205190022", "510107199207020019", "510107199208110024", "510107199208130025", "510107199208220047", "510107199209080015", "510107199210250026", "510107199211110017", "510107199301020015", "510107199301020023", "510107199301020031", "510107199301070012", "510107199302020025", "510107199303030014", "510107199303030022", "510107199305190011", "510107199305190038", "510107199305190054", "510107199305190070", "510107199305190097", "510107199305190118", "510107199312050017", "510107199312051239", "510107199401010017", "510107199401010033", "510107199401010519", "510107199401020012", "510107199401020020", "51010719940102008X", "510107199401020100", "510107199401040013", "510107199401050027", "510107199401060014", "51010719940107001X", "510107199401070036", "510107199401070044", "510107199401070052", "510107199401070079", "510107199401070095", "510107199401070175", "510107199401070191", "510107199401070212", "510107199401070239", "510107199401070255", "510107199401072875", "510107199402020014", "510107199402020022", "510107199405120010", "510107199405120897", "510107199405190019", "510107199405190035", "510107199405190115", "510107199405190131", "510107199405190158", "510107199405190174", "510107199405190190", "510107199405190211", "510107199405190238", "510107199405190254", "510107199405190414", "510107199405190430", "510107199405190457", "510107199405190473", "51010719940519049X", "510107199405207191", "510107199410103557", "510107199410240017", "510107199412050014", "510107199412051236", "510107199412120019", "510107199412230015", "510107199501010022", "510107199501010049", "510107199501010065", "510107199501010081", "510107199501010102", "510107199501040010", "510107199503020013", "510107199507210017", "510107199512050011", "510107199512051049", "510107199601050021", "510107199601070014", "510107199611110016", "510107199612021218", "510107199612050027", "510107199612140014", "510107199808161458", "510107199809080019", "510107199812030020", "510107199812160028", "510107199901010013", "510107199909090011", "510107199909090038", "510107199909090054", "510107199910108928", "510107200102010012", "510107200108070016", "510107200108070032", "510107200111101215", "510107200112030017", "510107200201010018", "510107200201020021", "510107200208140018", "510107200312020016", "510107200512024687", "510107200604010020", "510107201007280019", "510107201101010023", "510107201101010031", "51010720110101004X", "510107201201010012", "510107201201230015", "510107201201280020", "510107201204060015", "510107201207050023", "510107201207100019", "51010720130101001X", "510107201301010028", "510107201301010036", "510107201301020023", "510107201302100017", "510107201303070016", "510107201306060024", "510107201306100014", "510107201307030011", "51010720130910001X", "510107201309110015", "510107201309110023", "51010720130912007X", "51010720131008001X", "510107201311140010", "510107201312040011", "510107201312110024", "510107201312310018", "510107201312310034", "510107201312310149", "510107201312310448", "51010720140215002X", "510107201404150023", "510107201408050011", "510107201410010035", "510107201411040017", "510107201411040033", "510107201411120017", "510107201412051201", "510107201501050016", "510107201501230033", "510107201501260013", "510107201501260048", "510107201501260064", "510107201501260187", "510107201501260187", "51010720150129001X", "510107201502020011", "510107201502030025", "510107201502110017", "51010720150401001X", "510107201504070012", "510107201504210011", "510107201505060027", "510107201506010013", "51010720150601003X", "510107201506090017", "510107201506100019", "510107201506100350", "510107201506100369", "510107201506100430", "510107201506100457", "510107201506100633", "51010720150610065X", "510107201506100713", "510107201506100713", "510107201506100772", "510107201506100879", "510107201506103690", "510107201506103690", "510107201506105426", "51010720150610647X", "510107201506106525", "510107201506106541", "510107201506107392", "510107201506107464", "510107201506107691", "510107201506108475", "510107201506110022", "510107201506260012", "510107201506270018", "510107201506270034", "510107201507020010", "510107201507060020", "510107201507080013", "510107201507080013", "510107201507080021", "51010720150708003X", "510107201507080056", "510107201507100010", "510107201507110032", "510107201507170019", "510107201507170035", "510107201507180014", "510107201507220012", "510107201507220039", "510107201507230018", "510107201507250027", "51010720150727001X", "510107201507290010", "510107201508020012", "510107201508040013", "510107201508050027", "510107201508050035", "510107201508060014", "510107201508140014", "510107201509010019", "510107201509020022", "51010720150908005X", "510107201509120015", "510107201509150054", "510107201509150193", "510107201509150214", "51010720150915045X", "510107201509160033", "510107201509240025", "510107201509250012", "510107201510010016", "510107201510010032", "510107201510060013", "51010720151006003X", "51010720151009001X", "510107201510120012", "510107201510130026", "510107201510130042", "510107201510130050", "510107201510130077", "510107201510130093", "510107201510150019", "510107201510190029", "510107201510200012", "510107201510200020", "510107201510200039", "510107201510200055", "510107201510200063", "510107201510200071", "51010720151020008X", "510107201510200100", "510107201510200119", "510107201510210018", "510107201510210034", "510107201510210050", "510107201510210077", "510107201510210093", "510107201510210114", "510107201510210130", "510107201510210157", "510107201510210173", "510107201511010018", "510107201511010050", "510107201511010093", "510107201511020013", "510107201511030019", "510107201511040014", "510107201511040030", "510107201511120014", "51010720151121001X", "51010720151201001X", "510107201512010044", "510107201512010052", "510107201512010060", "510107201512010079", "510107201512010095", "510107201512010108", "510107201512010132", "510107201512010159", "510107201512010191", "510107201512010239", "510107201512010271", "510107201512070020", "510107201512100031", "510107201512110010", "510107201512120016", "510107201512140017", "510107201512180035", "510107201512180051", "510107201512230012", "510107201601010011", "51010720160101002X", "510107201601010038", "510107201601010046", "510107201601010054", "510107201601010062", "510107201601010070", "510107201601010097", "510107201601020017", "510107201601020033", "510107201601040018", "510107201601040026", "510107201601040034", "510107201601040050", "510107201601040077", "510107201601050013", "510107201601050021", "51010720160105003X", "510107201601050056", "51010720160105011X", "510107201601070014", "510107201601120034", "510107201601130013", "51010720160113003X", "510107201601130056", "510107201601130099", "510107201601140019", "510107201601150022", "510107201601150049", "510107201601231543", "510107201602020019", "510107201602020035", "510107201602020051", "510107201602030014", "510107201602031017", "51010720160204001X", "51010720160212001X", "510107201602230024", "510107201603010015", "510107201603020010", "510107201603030024", "510107201603040011", "51010720160304002X", "510107201603090019", "510107201603100010", "510107201603100037", "510107201603170027", "510107201603230026", "510107201603230042", "510107201603230069", "51010720160327001X", "510107201603290029", "510107201603290045", "510107201603290061", "510107201603300012", "510107201603310018", "510107201603310034", "510107201603310050", "510107201604010017", "510107201604010025", "510107201604010033", "510107201604010041", "51010720160401005X", "510107201604010068", "510107201604010076", "510107201604010092", "510107201604010113", "51010720160401013X", "51010720160407001X", "510107201604070036", "510107201604070052", "510107201604070079", "510107201604080015", "510107201604170029", "510107201604180016", "510107201604270011", "510107201604270038", "510107201605010019", "510107201605010051", "510107201605010078", "510107201605010094", "510107201605010115", "510107201605010131", "510107201605020014", "51010720160503001X", "510107201605030036", "510107201605040015", "510107201605040031", "510107201605040058", "510107201605050010", "510107201605154565", "510107201605180018", "510107201605190013", "51010720160519003X", "510107201605230011", "510107201605230038", "510107201605250012", "510107201605250039", "510107201605250055", "510107201605280019", "510107201605290014", "510107201605290516", "510107201605300016", "510107201605300032", "510107201605300518", "510107201605300534", "510107201605300550", "510107201605310011", "510107201606010010", "510107201606010037", "510107201606010512", "510107201606010539", "510107201606050012", "510107201606058743", "510107201606060018", "510107201606130012", "510107201606150013", "510107201606170014", "510107201606170022", "51010720160618001X", "51010720160620005X", "510107201606200076", "510107201606200092", "510107201606210012", "510107201606240019", "510107201606240035", "510107201606240051", "51010720160626001X", "510107201606260036", "510107201606260052", "510107201606260079", "510107201606270015", "510107201606270023", "510107201606270031", "510107201606270509", "510107201606270517", "510107201606270533", "510107201606280010", "510107201606280037", "510107201606280053", "510107201606280096", "510107201606290024", "510107201606290032", "510107201606290040", "510107201606290059", "510107201606290112", "510107201606290534", "510107201606290630", "510107201606290657", "510107201606300018", "510107201606300026", "51010720160630051X", "510107201606300579", "510107201606300595", "510107201607010012", "510107201607020018", "510107201607020026", "510107201607020034", "510107201607050014", "510107201607050030", "510107201607050049", "510107201607050057", "510107201607050065", "510107201607050073", "510107201607050081", "51010720160705009X", "510107201607050110", "510107201607050137", "510107201607050153", "51010720160705017X", "510107201607050196", "510107201607050217", "510107201607050233", "510107201607050276", "510107201607050292", "51010720160706001X", "510107201607070015", "510107201607070023", "510107201607070031", "51010720160707004X", "510107201607070058", "510107201607070074", "510107201607070090", "510107201607080010", "510107201607100018", "510107201607130014", "510107201607130030", "510107201607130057", "510107201607130073", "51010720160713009X", "510107201607130110", "510107201607130137", "510107201607130153", "51010720160713017X", "51010720160714001X", "510107201607140036", "510107201607140052", "510107201607140079", "510107201607140095", "510107201607140116", "510107201607150015", "510107201607160010", "510107201607160029", "510107201607160037", "510107201607160045", "510107201607160053", "510107201607160061", "51010720160716007X", "510107201607160096", "510107201607160133", "51010720160716015X", "510107201607170016", "510107201607170032", "510107201607190017", "510107201607200019", "510107201607200035", "510107201607200051", "510107201607210014", "510107201607210030", "510107201607210057", "510107201608030023", "510107201608030031", "510107201608080012", "510107201608160012", "51010720160817035X", "510107201608170376", "510107201608170392", "510107201608170413", "51010720160817043X", "510107201608170472", "510107201608170536", "510107201608170552", "510107201608170595", "510107201608220011", "510107201608230017", "510107201608230033", "51010720160829001X", "510107201608290036", "510107201608290052", "510107201608300011", "510107201608300038", "510107201608300054", "510107201608300070", "510107201608300097", "510107201608300118", "510107201608310017", "510107201609010016", "510107201609050018", "510107201609100011", "510107201609190010", "510107201609190037", "510107201609210018", "510107201609210034", "510107201609220013", "510107201609230019", "510107201609230035", "510107201609230051", "510107201609230078", "510107201609290011", "510107201609290038", "510107201609290054", "510107201609290134", "510107201610010013", "51010720161001003X", "510107201610050015", "510107201610060010", "510107201610060029", "510107201610070016", "510107201610110110", "510107201610190018", "510107201611230026", "510107201611240013", "510107201611240021", "51010720161124003X", "510107201611240056", "510107201611240099", "51010720161124011X", "510107201611300012", "510107201612160015", "510107201612300014", "510107201702010037", "51010720170226001X", "510107201702260028", "510107201702260036", "510107201702270015", "510107201703030013", "510107201703030056", "510107201703030072", "510107201703030099", "51010720170303011X", "510107201703150023", "510107201703150031", "510108200011110081", "510113199005197198", "510117199512050014", "510124198808083244", "510125199907075582", "510228193101200003", "510228193101211116", "510228193101250617", "510402198909140410", "510502193509047025", "510502198610212227", "510502198909140416", "510502199509230417", "510502200001048767", "510521193311156196", "510521196712096722", "510521197504235235", "510521200603040139", "510523192901020318", "510523195604141969", "510602197809013453", "51060319900101001X", "510603199001010036", "510603199009090018", "510603199009090026", "510603199009090034", "510603199405190010", "510603199405190037", "510603199405190053", "51060319940519007X", "510603199405190096", "510603199405190096", "510603199405190117", "510603201209130029", "510603201603010017", "510603201607050016", "51061919940208917X", "51070419390101001X", "510704196201010020", "510704198201010011", "510704199901010025", "510704199909090023", "510704200001010017", "510704200001010033", "51070420000101005X", "510704200301010019", "510704201603190013", "51070420160319003X", "510704201603190056", "510704201603190072", "510704201603190099", "51070420160319011X", "510704201603190136", "510704201603190152", "510704201603190179", "510704201603190195", "510704201603190216", "510711199909091257", "510781199410103553", "510781199410103553", "510781199410103561", "510901198909140411", "510903188401010011", "51090318840101002X", "510903201507010048", "510903201507010080", "51090320150701011X", "510903201507010128", "510903201507010136", "510903201507010144", "510903201507010160", "510903201507010179", "510903201507010187", "510903201507010208", "510903201507010232", "510903201507010259", "510903201507010267", "510903201507010283", "510903201507010291", "510903201507010312", "510903201507010339", "510903201507010478", "510903201507010494", "510903201507010515", "510903201507010531", "511023198810056818", "511023198810056826", "511023199012053246", "511023199012056236", "511023199012058792", "511023201503041979", "511024201509010010", "511025197511127311", "511025197511127338", "511025197511127354", "511025197812120017", "511025199901010011", "511025200101010019", "511025200101010035", "511025200301010013", "51102520030101003X", "511025200301010056", "511025200301020019", "511025200301030014", "511025200302140012", "511025200302140012", "511025200302147361", "511025200501010018", "511025200501010026", "511025200701010012", "511025201507010013", "511025201509010025", "511025201509020012", "511025201510090018", "511025201510090026", "511025201510090034", "511025201510090050", "511025201510090077", "511102198808080839", "511102198902280554", "511102198909140407", "511102198909140415", "511102198909140423", "511102198909140431", "51110219890914044X", "511102198909140458", "511102198909140466", "511102198909140474", "511102198909140482", "511102198909150410", "511102198909150429", "511102198909150445", "511102199009240415", "511102199009240431", "511102199904010026", "51110219990819001X", "511102199909010017", "511102200001010012", "51110220000914041X", "511102200109010014", "511102200109010030", "511102200204170016", "511102200205140011", "511102201101010014", "511102201109010019", "511102201109010035", "511102201109010051", "511102201501010013", "511102201508060013", "51110220150806003X", "511102201508130026", "511102201509010034", "511102201509010069", "511102201509010093", "511102201509010106", "511102201509010114", "511102201509010130", "511102201509010149", "511102201509010157", "511102201509010165", "511102201509020013", "511102201509090011", "51110220150913001X", "511102201509150010", "511102201509150037", "511102201509150053", "511102201509160016", "511102201509160032", "511102201509170011", "51110220150917002X", "511102201509180017", "511102201509180025", "511102201509180033", "511102201509180041", "51110220150918005X", "511102201509180068", "511102201509190012", "511102201509190020", "511102201509190047", "511102201509220023", "51110220150922004X", "511102201509220066", "511102201509230010", "511102201509230037", "511102201509230037", "511102201509240016", "511102201509240024", "511102201509240032", "511102201511030026", "511126199009145910", "511521199101011237", "511521199101015553", "511521199301012357", "511521199303031236", "511521199401012346", "511521199401012397", "511521199401014448", "511521199401014448", "511521199403032340", "511521199405052345", "51152119950505222X", "511521199607292152", "511521199801012345", "511521201202022349", "511521201601012340", "51152219940202111X", "511522199402021232", "511522199402022227", "511531199803031235", "511921198808171055", "512111190102012157", "512151199012050207", "512319199012051403", "512411199012051256", "512458199012056415", "51320119940519719X", "513401198208140019", "513401198512030025", "513401199012050024", "513401199104050013", "513401201101010024", "513401201509090013", "513401201510130019", "513401201511130010", "513401201512030011", "513811199405197195", "513822199405197186", "513822199405197194", "513822199405197194", "520721199501021129", "520721199501021129", "521365201501269859", "541215199012051247", "54512419901205125X", "54545419930304787X", "545484199012054568", "546464199201054212", "546545199912297882", "552114201501269854", "556667201101010097", "567899201601018815", "584512199012054525", "584512200012051522", "584798201601012228", "584874199012054563", "675478201601010098", "721453201501239657", "745451199501024511", "777111201101019908", "77777720110101889X", "778990201101019908", "786566199012054566", "787242199012034569", "788989201501016673", "789456199102030001", "789456199102034563", "789456199111111110", "789781199012034562", "825214201101269859", "842541199012054561", "845444199905014563", "845784199601021542", "851245199012051256", "852126201501269850", "852147201101269853", "852147201501239653", "852147201501269844", "85412119901203521X", "854121199012052319", "854215199012054566", "874111199012054518", "878441199102031238", "878981199012062311", "880990201101018890", "880990201101019906", "888888201109099998", "888999201101019943", "894656201401269858", "897519199601054566", "897541199010024514", "897845199301054512", "897979199010054511", "963142201501239850", "96314720150123965X", "96317220150123955X", "963741201201239652", "963741201501239697", "966147201501239652", "986132201501269850", "986515201501239657", "986525201501249858", "987871199303010120", "990219198909140416", "990880201101010095", "990880201109098896", "991221199601016678", "999088201101022227", "999888201109098895", "999999201601012226" ]
    ;
    for ( var i = 0, len = idCodeList.length; i < len; i++ ) {
        var
            idCode = idCodeList[ i ]
        ;
        if ( ! IDValidator.validateID( idCode ) ) {
            // console.info( idCode + " 验证不通过。" )
        }
    }
} );