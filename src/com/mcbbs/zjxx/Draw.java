package com.mcbbs.zjxx;

import java.io.File;

import java.io.IOException;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import org.bukkit.plugin.java.JavaPlugin;

public class Draw extends JavaPlugin {

	public void onEnable() {
		
		if(!getDataFolder().exists()) {
            getDataFolder().mkdir();
          }
          File file=new File(getDataFolder(),"config.yml");
           try{getConfig().save(file);}
          catch
          (IOException e){e.printStackTrace();}
           if (!(file.exists())) {saveDefaultConfig();}
          reloadConfig();
          getLogger().info("咸鱼插件已就位");
        
         
		}

		public void onDisable() {
		//卸载是执行XXX
}	
		
		@Override

		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){if (cmd.getName().equalsIgnoreCase("draw")){
			int n =(int)(1+Math.random()*(108-1+1));
			String name = sender.getName();
					String[]str = new String[] {"第一签，上上，子宫。\r\n"
							+"天开地辟作良缘，日吉时良万物全；若得此签非小可，公行忠正帝王宣",
							"第二签，中平，子宫。\r\n"
							+"鲸鱼未变守江湖，不可升腾离碧波；异日峥嵘身变化，许君一跃跳龙门",
							"第三签 ，下下，子宫。\r\n"
							+"临风冒雨去还归，役役劳身似燕儿；衔得泥来若作垒，到头垒坏复成泥",
							"第四签，中平 ，子丑宫。\r\n"
							+"千年古镜复重圆，女再求夫男再婚；自此门庭多改换，更添福禄共子孙",
							"第五签，中平 ，子宫。\r\n"
							+"一锄凿地要求泉，努力求之得最难；无意俄然遇知己，相逢携手上青天",
							"第六签，中平 ，丑宫。\r\n"
							+"报君岩下铜鸟居，须是还他大丈夫；舍得金宝谁可得，通行天下此人无",
							"第七签，下下，丑宫。\r\n"
							+"奔波阻隔重重险，带水拖泥又渡山；更望他乡求用事，千山万水未回还",
							"第八签，上上，丑宫。\r\n"
							+"茂林松柏正兴旺，雨雪风霜总不摧；异日自然成大用，功名作个栋梁材",
							"第九签，上上，丑宫。\r\n"
							+"愿君勿问心中事，此意偏宜说向公；一片明心清皎月，恰如晧月正当中",
							"第十签，中平，亥宫。\r\n"
							+"石芷无价宝和珍，只管他乡外界寻；宛如持灯理觅火，不如收拾枉劳心",
							"第十一签，中平，亥宫。\r\n"
							+"欲求万事喜非常，争奈亲姻只暂忙；到头毕竟乘鹿箭，贵人指引贵人乡",
							"第十二签，上上，亥宫。\r\n"
							+"否极泰来咫尺间，抖擞君子出于山；若遇虎兔佳音信，立志忙中事不难",
							"第十三签，上上，亥宫。\r\n"
							+"自小生在富贵家，眼前万事总奢华；蒙君赐紫金鱼带，四海传名足可夸",
							"第十四签，上上，卯宫。\r\n"
							+"宛如仙鹤出樊笼，脱得樊笼处处空；南北东西无障碍，任君直上九霄宫。\r\n",
							"第十五签，下下，卯宫。\r\n"
							+"行人一口气难吞，却有灾事近来临；鸟投林巢无所宿，好寻深处稳安身",
							"第十六签，上上，卯宫。\r\n"
							+"愁眉思虑渐时开，启出云宵喜日来；宛如粪土一块玉，良工一举出尘埃",
							"第十七签，下下，卯宫。\r\n"
							+"莫听闲言说是非，晨昏只好念阿弥；若将妄语为真实，画饼如何止得饥",
							"第十八签，中平，卯宫。\r\n"
							+"金鸡西坠兔东升，日夜循环古自今；僧道得之无不利，工商农士各从心",
							"第十九签，下下，辰宫。\r\n"
							+"急水滩头放船儿，狂风作浪欲何为；若要安然求稳静，守时浪静过此危",
							"第二十签，上上，辰宫。\r\n"
							+"当春久雨喜初晴，玉兔金鸡渐渐明；旧事销散新事遂，看看一跳过龙门",
							"第二十一签，上上，辰宫。\r\n"
							+"阴阳道合总由天，女嫁男婚岂偶然；但看龙蛇相会合，熊罢入梦喜团圆",
							"第二十二签，中平，巳宫。\r\n"
							+"旱时田地皆枯竭，谢天甘雨下霖淋；花果草木都润泽，始知一雨值千金",
							"第二十三签，中平，巳宫。\r\n"
							+"欲攀仙桂入蟾宫。\r\n"
							+"，岂虑天门不放行；忽然一般音信好，高人自送岭头云",
							"第二十四签，下下，巳宫。\r\n"
							+"不成理论不成家，水性痴人似落花；若问君恩难得力，到头毕竟事如麻",
							"第二十五签，中平，巳宫。\r\n"
							+"过了忧危第几重，从今再历永无凶；宽心自有宽心计，得遇高人护大功",
							"第二十六签，下下，午宫。\r\n"
							+"上下传来事总虚，天边收得一封书；书中许我功名事，直待终时亦是空",
							"第二十七签，中平，午宫。\r\n"
							+"一谋一用一番机，虑後思前不敢为；时至贵人相助力，银墙铁壁好安居",
							"第二十八签，下下，午宫。\r\n"
							+"东方月上正婵娟，顷刻云遮亦暗存； 或有圆时还有缺，更言非看复皆全",
							"第二十九签，上上，午宫。\r\n"
							+"宝剑出匣跃光明，在匣全然不惹尘； 今得贵人携出现，有威有势众人钦",
							"第三十签，下下，午宫。\r\n"
							+"劝君切莫向他求，似鹤飞来暗箭投；若去采薪蛇在草，恐遭毒口也忧愁",
							"第三十一签，中平，未宫。\r\n"
							+"清闲无忧静处坐，饱后食茶困时卧；放下身心不用忙，必定不遭殃与祸",
							"第三十二签，中平，未宫。\r\n"
							+"前程杳杳定无疑，石中藏玉有谁知；一朝良匠分明剖，始觅其中碧玉奇",
							"第三十三签，中平，未宫。\r\n"
							+"内藏无价宝玉珍，得玉何须外界寻；不如等待高人识，恰如灵雨涤烦襟",
							"第三十四签，上上，未宫。\r\n"
							+"行藏出入礼仪恭，言必中听信必聪；心事了然俱清澈，光明如日正当空",
							"第三十五签，中平，申宫。\r\n"
							+"衣冠重整旧宿风，道是无功却有功；扫却当途荆棘刺，三人共议事和同",
							"第三十六签，下下，申宫。\r\n"
							+"欲待安身运到时，风中灯火不得宜；不如收拾深堂坐，庶免光摇拂拂期",
							"第三十七签，下下，申宫。\r\n"
							+"月照天书静处期，却被云雾昏又迷；宽心等待浮云散，此时更宜好施为",
							"第三十八签，上上，申宫。\r\n"
							+"百事从今百路通，好似文王遇太公；当年文明高天下，声名赫耀帝城中",
							"第三十九签，中平，酉宫。\r\n"
							+"天边消息应难思，切莫牵罡妄强求；若把石头磨作镜，曾知枉费已工夫",
							"第四十签，中平，酉宫。\r\n"
							+"红轮西坠兔东升，阴长阳短百事亨；若是女人宜望用，增添禄福称你心",
							"第四十一签，下下，酉宫。\r\n"
							+"无限好语君须记，却为隐贼作知己；莫贪眼下有些甜，可虑他年前样苦",
							"第四十二签，上上，酉宫。\r\n"
							+"皇君圣后总为恩，复待祈祷无损增； 一切有情皆受用，人间天下得期亨",
							"第四十三签，上上，戌宫。\r\n"
							+"天地交泰万物全，自营自养自然锦；收罗万象皆精彩，事事称心谢圣贤",
							"第四十四签，中平，戌宫。\r\n"
							+"棋逢敌手着便宜，黑白盘中未决时；皆因一着知胜败，须教自有好推移",
							"第四十五签，上上，戌宫。\r\n"
							+"温柔自古胜强刚，积善于门大吉昌；若有贵人得此卦，宛如正渴遇琼浆",
							"第四十六签，上上，戌宫。\r\n"
							+"劝君耐守旧生涯，把定心肠莫听邪；直待有人轻著力，枯枝老树再生花",
							"第四十七签，上上，亥宫。\r\n"
							+"锦上添花色愈鲜，运来禄马喜双全；时至莫道功名慢，一举登科四海传",
							"第四十八签，上上，亥宫。\r\n"
							+"鲲鸟飞来化作鹏，遨游快乐去飞腾；翱翔万里云霄外，任是诸禽总不能",
							"第四十九签，下下，亥宫。\r\n"
							+"天寒地冻水成冰，何须贫苦自悭名；吸得守已静处坐，待时再变自然明",
							"第五十签，上上，亥宫。\r\n"
							+"五湖四海任君行，高挂帆篷自在撑；若得顺风随即至，落船宝贝喜层层",
							"第五十一签，中平，子宫。\r\n"
							+"夏日初临日最长，人人愁热闷非常；天公也解诸人意，薰风拂过自然凉",
							"第五十二签，下下，子宫。\r\n"
							+"水中捞月费工夫，费尽工夫却又无；莫信闲言与乱语，枉劳心力独身孤",
							"第五十三签，上上，子宫。\r\n"
							+"失意翻成得意时，龙吟虎啸两相宜；青天自有通宵路，许我功名再人期",
							"第五十四签，下下，子宫。\r\n"
							+"梦中得宝醒来无，自谓南山只是锄； 苦问婚姻并问病，别寻他路好相扶",
							"第五十五签，上上，丑宫。\r\n"
							+"父贤传子子传孙，衣禄丰盈只在天；金马玉堂人快乐　饥食渴饮倦时眠",
							"第五十六签，中平，丑宫。\r\n"
							+"涧小石粗流水响，月白风清贵人忙；路须君问何方去，管取林中花处香",
							"第五十七签，中平，丑宫。\r\n"
							+"闻是说非风过耳，好衣好禄自当中；君莫记取他年事，汝意还与我意同",
							"第五十八签，下下，丑宫。\r\n"
							+"直言说话君须记，莫在他乡求别艺；劝君安守旧生涯，除却有馀都不利",
							"第五十九签，下下，亥宫。\r\n"
							+"直上重楼去藏身，四围荆棘绕作林；天高君命长和短，得意翻成失意人",
							"第六十签，下下，亥宫。\r\n"
							+"抱薪救火火增烟，烧遍三千及大千；若问营谋并出入，不如收拾枉劳情",
							"第六十一签，中平，亥宫。\r\n"
							+"日上吟诗月下歌，逢场作戏笑呵呵；相逢会遇难藏避，喝彩齐唱嗹哩罗",
							"第六十二签，中平，亥宫。\r\n"
							+"晨昏全赖佛扶持，虽是逢危且不危；若得贵人来指引，此时财食自相随",
							"第六十三签，下下，卯宫。\r\n"
							+"昔日行船失了针，今朝依旧海中寻；若还寻得原针在，也费功夫也费神",
							"第六十四签，下下，卯宫。\r\n"
							+"游玩却在碧波池，暗遭罗网四边围；思量无计翻身出，命到泉关苦独悲",
							"第六十五签，下下，卯宫。\r\n"
							+"眼前欢喜未为欢，亦不危兮亦不安；割肉成疮因甚事，不如守旧待时宽",
							"第六十六签，下下，卯宫。\r\n"
							+"路险马乏人行急，失阵单卒困相当；滩高风浪船头破，日暮花残天降藉",
							"第六十七签，中平，卯宫。\r\n"
							+"一条金秤秤君心，无减无增无重轻；为人平生心正直，文章全识义皆明",
							"第六十八签，中平，卯宫。\r\n"
							+"门庭日庆喜非常，积善于门大吉昌；婚姻田蚕诸事遂，病逢妙药得安康",
							"第六十九签，中平，辰宫。\r\n"
							+"冬来岭上一枝梅，叶落枯枝总不摧；探得阳春消息至，依然还我作花魁",
							"第七十签，下下，辰宫。\r\n"
							+"役役恰似采花蜂，飞去西南又去东；春尽花残无觅处，此身不恋旧丛中",
							"第七十一签，下下，辰宫。\r\n"
							+"谁知苍龙十九衙，好似女子嫁二夫；自是一弓施两箭，切恐龙马上安居",
							"第七十二签，下下，辰宫。\r\n"
							+"弄蜂须要求他蜜，只怕遭他尾上针；虽是眼前有异路，暗里深藏荆棘林",
							"第七十三签，上上，巳宫。\r\n"
							+"春来雷震百鸟鸣，翻身一转离泥土；忽过风云交际处，有朝变化更成龙",
							"第七十四签，下下，巳宫。\r\n"
							+"似鸽飞来自投笼，欲得翻身却不通；南北东西都难出，此卦只恐恨无穷",
							"第七十五签，下下，午宫。\r\n"
							+"宛如抱虎过高山，战战竞竞胆碎寒；幸得山前逢妙手，切须保守一身安",
							"第七十六签，下下，午宫。\r\n"
							+"鱼龙混杂意和同，耐守寒潭未济通；不觉一朝头角耸，禹门一跳到龙宫。\r\n"
							+"",
							"第七十七签，下下，午宫。\r\n"
							+"梦中说事获多财，身外浮名总虚来；水远山遥难信实，贵人一指笑颜开",
							"第七十八签，中平，午宫。\r\n"
							+"冷水来浇白雪洋，不寒不热自温凉；若行天下无他事，惟有身中一艺强",
							"第七十九签，下下，午宫。\r\n"
							+"虚空许愿保平安，保得人安愿未还；莫忘天恩失还了，岂知佛语莫轻慢",
							"第八十签，上上，未宫。\r\n"
							+"直上高岩去学仙，岂知一旦帝王宣；青天白日常明照，心正声名四海传",
							"第八十一签，上上，未宫。\r\n"
							+"梧桐叶落秋将暮，行客奔程似若飞；谢得天公轻著力，顺风船载宝珍归",
							"第八十二签，下下，未宫。\r\n"
							+"炎炎烈火焰连天，焰中还有一朵莲；到底未烧终不害，依前生叶长枝根",
							"第八十三签，中平，未宫。\r\n"
							+"譬若初三四五月，半有半无未完全；等待十五良宵夜，到处光明到处圆",
							"第八十四签，下下，未宫。\r\n"
							+"因名丧德不和同，切莫急中变作凶；酒醉不知何处去，青松影里梦朦胧",
							"第八十五签，中平，申宫。\r\n"
							+"云开雾罩山前路，万物园中可再圆；醉读诗书沉梦醒，贵人指引步天台",
							"第八十六签，上上，申宫。\r\n"
							+"春来花发映阳台，万物车前进宝财；跃过禹门三级浪，恰如平地一声雷",
							"第八十七签，中平，申宫。\r\n"
							+"人行半岭日衔山，峻险层岩未可安；仰望上天垂护佑，此身犹在太虚间",
							"第八十八签，下下，酉宫。\r\n"
							+"木雕一虎在当门，须是有威不害人；分明说过无妨事，忧恼迟疑恐惧心",
							"第八十九签，上上，酉宫。\r\n"
							+"出入营谋大吉昌，似玉无瑕石中藏；如今幸得高人引，斯时得宝有风光",
							"第九十签，上上，酉宫。\r\n"
							+"忽然一信向天飞，泰山宝贝落船归；若问路途成好事，前头仍有贵人推",
							"第九十一签，上上，酉宫。\r\n"
							+"好展愁眉届众来，前途改变喜多才；一条大路如天阔，凡有施为总称怀",
							"第九十二签，上上，酉宫。\r\n"
							+"自幼为旅任施为，财禄丰盈不用求；若问进身谋望事，秀才出去状元回",
							"第九十三签，中平，戌宫。\r\n"
							+"鸾凤翎毛雨落垂，当时应被雀轻欺；忽朝一日云霄霁，依旧还我振羽衣",
							"第九十四签，中平，戌宫。\r\n"
							+"君子莫信小人推，事有差讹惹是非；琴鸣须有知音在，守常安静得便宜",
							"第九十五签，中平，戌宫。\r\n"
							+"事业功勤暮与朝，营华物态不胜娆； 若见金鸡报君语，福禄声名价自超",
							"第九十六签，上上，戌宫。\r\n"
							+"巍巍宝塔不寻常，八面玲珑尽放光；劝君志气勤顶礼，作善天龙降千祥",
							"第九十七签，下下，亥宫。\r\n"
							+"当空点烛摇疏影，恍惚铺成杨柳花；累被儿童来收拾，岂知只是浮自嗟",
							"第九十八签，下下，亥宫。\r\n"
							+"出入求财事迟疑，只恐闲愁惹是非； 如鸟飞投罗网里，相逢能有几多时",
							"第九十九签，下下，亥宫。\r\n"
							+"勒马持鞭直过来，半有忧危半有灾；恰似遭火焚烧屋，天降一雨汤成灾",
							"第一百签，下下，亥宫。\r\n"
							+"佛神说尽与君知，痴人说事转昏迷；老人抽得灵签足，不如守旧待来时",
							"第一百一签，上上，子宫。\r\n"
							+"天时久旱逢甘露，空谷传声开佳音,事怕不通则变，灵丹点铁也成金",
							"第一百二签，中平，子宫。\r\n"
							+"人言海上有神仙，方士如何去不返,有真无假无实迹，四门无路到平关",
							"第一百三签，上上，子宫。\r\n"
							+"中原狡兔正肥秋，大请将军脱窜归,依把锦书传雁足，果然一箭中双雕",
							"第一百四签，上上，子宫。\r\n"
							+"喜袭自问一点黄，诏书催子入朝门,从今显达皆荣贵，且待天颜荫宠光",
							"第一百五签，上上，丑宫。\r\n"
							+"扁舟乘浪装高载，万里顺风去作商,百货低昂从积蓄，义取财帛富贵乡",
							"第一百六签，上上，丑宫。\r\n"
							+"否极应知有泰来，灵芝生出自起埃,阳回九十开春去，时至百花大盛开",
							"第一百七签，上上，丑宫。\r\n"
							+"卦中吉兆是青龙，作事求谋处处通,男婚女嫁官事吉，更无忧虑喜重重",
							"第一百八签，上上，丑宫。\r\n"
							+"自尽苦难白龙乡，几年疑虑变为祥,今朝得到江南地，拔尽浮云见太阳",
							
						
					};
					String text = str[n-1];
					int i = text.lastIndexOf("上上");
					int i2 = text.lastIndexOf("中平");
					if(i>0) {
					sender.sendMessage(ChatColor.DARK_PURPLE+text);
					}
					else {
					if(i2>0) {
						sender.sendMessage(ChatColor.BLUE+text);
						}	
					else {
						sender.sendMessage(text);
					
					}
					
					}
						
					
					if (n==108) {
						sender.sendMessage(ChatColor.GOLD+"第一百九签，万事大吉。\r\n" + 
								"弟子拜佛心子专，理应购油来添灯。若是灯油添得足，保你家门万事兴。");
						Bukkit.broadcastMessage("玩家"+name+"欧气爆发，抽签结果为“万事大吉”");
						
					}
				
				 
			
				 
				    
			
			 return true;
		}
			
			
		
		return false;
		}
		
		
			
} 
		

	


