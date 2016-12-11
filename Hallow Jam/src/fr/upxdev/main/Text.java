package fr.upxdev.main;
//BY FRANK THERMEAU
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Text extends GameObject{
	
	private String[][][] story;
	private String [][][] choice;
	private ID id;
	private int heightText;
	private String[] actualText;
	
	
	
	public Text(int x, int y, ID id){
		super(x, y, id);
		this.id=id;
		this.story = new String[10][7][];
		this.choice = new String[10][7][7];
		addTextStory(0, 0, backLine("Il fait froid, l'ombre entoure ton corps endolorie, le sol froid paralyse ta joue déjà glacée. L'épuisement est maître de tes membres et ta tête ne semble qu'à peine te répondre. Tu lèves difficilement les yeux afin de découvrir le lieu dans lequel tu te trouves sans arriver à discerner correctement tous les détails, tu remarques qu'une mousse fluorescente recouvre les parois de lourdes pierres semblant former un long couloir sombre. Les questions t’assaillent mais impossible de te souvenirs de la manière dont tu as pu atterrir ici. Tu te lèves péniblement mais le souffle glacial du tunnel engourdie tes jambes déjà tremblantes. Tu ne peux pas rester ici tu le sais mais que faire alors que tu ne sais pas ou tu es ..."));
		addTextChoice(0, 0, 0, "Te retourner et regarder autour de toi");
		addTextChoice(0, 0, 1, "Avancer dans le long couloir en face de toi");
		addTextChoice(0, 0, 2, "");
		
		
	
		addTextStory(1, 0, backLine("Tu te retourne doucement afin de pouvoir distinguer l'étrange masse que tu as remarqué du coin de l’œil. C'est une femme, ou du moins le corps d'une femme dont les membres semble être fait de pierres. Pourtant sa poitrine ouverte et ensanglantée te permet de voir que son cœur ni prend plus place. Effrayé et horrifié par ce terrible spectacle il ne te prend qu'une envie : c'est de sortir d'ici. Tu avances alors difficilement dans le couloir inquiétant, le soutient de la pierre est presque réconfortant, comme une présence mystique te venant en aide dans ce terrible chemin. C'est alors que tu vois, au loin, une silhouette qui te semblerait presque humaine. C'est un élan d'inquiétude et d'espoir qui s'empare de toi. Tu tente de crier mais aucun son ne peut sortir de ta bouche. C'est paralysé que tu restes un moment à regarder la masse noir avancer elle aussi vers toi. Tu plisses les yeux inquiété par ce qui s'approche. Un tremblement presque imperceptible s'échappe de la roche et un murmure discret s'en échappe, mais impossible de savoir si ce son est celui d'une femme en détresse ou du vent qui caresse la mousse."));
		addTextChoice(1, 0, 0, "Attendre de pouvoir distinguer l'être devant toi");
		addTextChoice(1, 0, 1, "Se cacher dans une alcôve");
		addTextChoice(1, 0, 2, "");
		
		addTextStory(1, 1, backLine("Tu avances alors difficilement dans le couloir inquiétant, le soutient de la pierre est presque réconfortant, comme si une présence mystique te venant en aide dans ce terrible chemin. C'est alors que tu vois , au loin, une silhouette qui te semblerait presque humaine. C'est un élan d'inquiétude et d'espoir qui s'empare de toi. Tu tente de crier mais aucun son ne peut sortir de ta bouche. C'est paralysé que tu restes un moment à regarder la masse noir avancer elle aussi vers toi. Tu plisses les yeux inquiété par ce qui s'approche. Un tremblement presque imperceptible s'échappe de la roche et un murmure discret s'en échappe, mais impossible de savoir si ce son est celui d'une femme en détresse ou du vent qui caresse la mousse."));
		addTextChoice(1, 1, 0, "Attendre de pouvoir distinguer l'être devant toi");
		addTextChoice(1, 1, 1, "Se cacher dans une alcôve");
		addTextChoice(1, 1, 2, "");
		
		
		
		addTextStory(2, 0, backLine("Tu es pétrifié par la vision de l'être qui ce tien devant toi. Une grande masse noir s'avance lentement, il n'est qu'a quelque mètres de toi caressant la pierre de ces longues mains funestes dont les doigts disparaissent dans les interstices. Son visage aussi sombre que le reste de son corps laisse ressortis un sourire aux dents acérées et aux yeux semblable à de grand vides près à engloutir ce sur quoi ils jettent leurs dévolus. Plus que quelques centimètres , il s’arrête devant toi, apeuré tu aimerais t’enfuir mais impossible, ton corps ne te répond plus. Il s'avance alors et te traverse sans peine.Ton souffle en ai coupé  tu t’écroules alors choqué, plus que jamais épuiser. Tu n'oses te retourner et sentir la mort t'entourer d'un draps noir. L'envie de vivre est trop grande , tu te saisis de tes dernières forces pour courir."));
		addTextChoice(2, 0, 0, "[CONTINUER]");
		addTextChoice(2, 0, 1, "");
		addTextChoice(2, 0, 2, "");
		
		addTextStory(2, 1, backLine("Un pressentiment s'empare de toi, soudainement, tu remarques sur le côté une alcôve de la taille d'un humain, tu t'y précipites alors terrorisé. La chose se rapproche de toi, tu le sens, mais le doute persiste alors que tu peux enfin distinguer l'être parcourant ces lieux. Une grande masse noire passe alors devant toi lentement de ces longues mains funestes il caresse les pierres alors que ses doigts disparaissent dans les interstices. Son visage aussi sombre que le reste de son corps d'un noir terrifiant laisse ressortir un sourire aux dents acérées et aux yeux semblable à de grands vides près à engloutir ce sur quoi ils jettent leurs dévolus. Collé à la pierre tu aimerais disparaître face à ce que l’on pourrait appeler un monstre terrifiant. Il s'éloigne, tu le sens, c'est ta chance tu cours dans la direction opposée de toutes tes forces."));
		addTextChoice(2, 1, 0, "[CONTINUER]");
		addTextChoice(2, 1, 1, "");
		addTextChoice(2, 1, 2, "");
		
		
		
		addTextStory(3, 0, backLine("Absolument magnifique, la grotte dans laquelle tu te trouves maintenant ne peut être qualifiée que d'un seul mot. Tu te trouves face à une grande étendu d'eau, de grandes ouvertures laisse les rayons de la lune caresser la surface. La lumière miroitant sur les soubresauts de l'eau d'un bleu mélangé de blanc laisse s’échapper des scintillements. Ces éclats de diamants se reflètent sur tous les rochers l'entourant de leurs corps imposant. L'eau paisible est le cœur de ce lieux enivrant. De grandes pierres s’élancent du sol de toute part laissant apparaître des cristaux d'un bleu clair presque pur, alors que la végétation les recouvres de ses lianes protégeant ce trésor de beauté. Les galet polis, et couvert de mousse, jonche le sol maintenant accueillant tel un lit de nature tendant ses bras vers ton corps meurtri. Tes yeux ne peuvent ce détacher de ce lac vivant de la lune, tu y aperçois une grande pierre semblant flotter sur l'eau ou des images antiques s'y dessine. L'apaisement que te provoque ce spectacle de pureté absolue touche ton cœur que tu entend battre doucement. Tes genoux appelés par la mousse tombe alors, pour enfin atteindre la douceur et le calme de ce lieux. Tu fermes alors les yeux un instant comme pour te sentir reprendre vie, ta respiration se calme lentement alors que tu entends encore ce murmure étrange. Mais un vent froid te glace le sang, tu te retournes violemment et manque de tomber, tu aperçois l'ombre s'approcher, il te faut t'échapper, regardant autour de toi tu aperçois deux grandes ouvertures de chaque cotés du lac."));
		addTextChoice(3, 0, 0, "Prendre le couloir de gauche");
		addTextChoice(3, 0, 1, "Prendre le couloir de droite");
		addTextChoice(3, 0, 2, "Nager vers la pierre ");
		
		
		
		addTextStory(4, 0, backLine("Paniqué tu cours sur les galets qui t’écorchent maintenant la peau, tu arrives face à ce couloir aussi sombre que le premier, tu t'y engouffres sans attendre te retrouvant face à une énorme pierre qui te laisse entrevoir des rayons lumineux de l'autre côté mais tu ne sais comment la passer."));
		addTextChoice(4, 0, 0, "Essayer de pousser la pierre");
		addTextChoice(4, 0, 1, "Retourner en arrière");
		addTextChoice(4, 0, 2, "");
		
		addTextStory(4, 1, backLine("Paniqué tu cours sur les galets qui t’écorchent maintenant la peau, tu arrives face à ce couloir aussi sombre que le premier, tu t'y engouffres sans attendre te retrouvant face à un mur de végétation qui te laisse entrevoir d'étranges rayons lumineux mais tu ne sais comment passer ces lianes entrelacées."));
		addTextChoice(4, 1, 0, "Retourner en arrière");
		addTextChoice(4, 1, 1, "Essayer d'arracher les lianes");
		addTextChoice(4, 1, 2, "");
		
		addTextStory(4, 2, backLine("Paniqué tu sautes dans l'eau nageant de toutes tes forces, peut être que l'ombre ne pourras pas te rattraper , c'est ce que tu espères du moins. Tu atteins enfin la rive , le rocher imposant que tu avais aperçu se fait plus nette te laissant voir à travers les feuilles le dessin d'une statue de femme tendant la main vers deux amoureux s'embrassant. Le dessin qui le suis est celle de cette statue le cœur de la jeune fille morte dans les main essayant désespérément d'en faire son propre cœur."));
		addTextChoice(4, 2, 0, "[CONTINUER]");
		addTextChoice(4, 2, 1, "");
		addTextChoice(4, 2, 2, "");
		
		
		
		addTextStory(5, 0, backLine("Tu retournes alors en arrière mais l'ombre est déjà là tendant les mains vers ta poitrine il t’effleure alors que tu plonges dans l'eau, une douleur s’empare de ton cœur mais tu arrives à nager jusqu’à la grande pierre."));
		addTextChoice(5, 0, 0, "CONTINUER");
		addTextChoice(5, 0, 1, "");
		addTextChoice(5, 0, 2, "");
		
		
		
		addTextStory(6, 0, backLine("Tes mains tentent de trouver une accroche sur la pierre tranchante glissant sur tes poignets maintenant ensanglantés. La pierre peine à se décaler mais elle semble bouger du moins assez pour que tu puisses t'y faufiler, la pierre se réchauffe alors brûlant ton bras alors que tu tentes de t'extirper. Entendant un grand bruit tu te retourne et constate que la pierre s’ouvre d'elle même. Tu te retrouve encore dans un long couloir, enivré par la peur tu cours jusqu’à une petite salle où se trouve une grande dalle laissant deviner le dessin d'une statue de femme tendant la main vers deux amoureux s'embrassant. Le dessins qui le suis est celui de cette statue portant le cœur de la jeune fille morte dans ses mains et essayant désespérément d'en faire son propre cœur. Au loin tu entends deux cris, celui d'une louve apeurée et d'un chien en souffrance."));
		addTextChoice(6, 0, 0, "Aller vers le chien");
		addTextChoice(6, 0, 1, "Aller vers la louve");
		addTextChoice(6, 0, 2, "");
		
		addTextStory(6, 1, backLine("Tu plonges tes mains désespérément dans les feuilles, te brûlant les mains alors que tu arraches les lianes qui tombent au sol laissant s'échapper un liquide rouge et sirupeux. L'ouverture est maintenant assez grande pour que tu puisses passer, pendant que les lianes bougent comme pour reprendre leurs places initiales, tu te retrouves encore dans un long couloir évitant les lianes s’avançant vers toi et tendant leurs feuilles empoisonnées. Évitant leurs tiges mouvantes, tu arrives jusqu'à une petite salle où se trouve une grande dalle laissant deviner le dessin d'une statue de femme tendant la main vers deux amoureux s'embrassant. Le dessins qui le suis est celui de cette statue portant le cœur de la jeune fille morte dans ses mains et essayant désespérément d'en faire son propre cœur. Au loin le cris d'une mère apeurée et celui d'une petite fille en détresse te parviennent."));
		addTextChoice(6, 1, 0, "Aller vers  la mère");
		addTextChoice(6, 1, 1, "Aller vers la petite fille");
		addTextChoice(6, 1, 2, "");
		
		addTextStory(6, 2, backLine("Derrière la pierre se dresse un long couloir, c'est ta chance, tu t'y lances sans attendre, au loin un monticule pour l'instant trop flou est éclairé par la lune. Les murmures se font de plus en plus nette \"vivre... je veux vivre...\" murmurent les pierres. Tu arrives enfin près du monticule , horrifié tu distingues des cadavres empilés la poitrine ouverte et sans cœur, tu recules paniqué, leurs membres sont pour certains transformés en pierre. C'est alors que tu tends l'oreille, une petite voix appelle à l'aide tu en es sûr, une main se mouvant à travers les cadavres t'apparais alors."));
		addTextChoice(6, 2, 0, "Attraper la main");
		addTextChoice(6, 2, 1, "Surmonter  l'amas de cadavres");
		addTextChoice(6, 2, 2, "");
		
		
		
		addTextStory(7, 0, backLine("Tu t'avances prudemment dans sa direction, tu aperçois un chien te regardant de ses yeux souffrants. Tu te rapproches alors le caressant pour le rassurer. Mais sans attendre il mord ton bras pris au piège impossible de le bouger alors qu'il se transforme en pierre. L’ombre se rapproche et souffle un vent glacial sur ta peau. Tu te débats mais l’ombre caresse ta poitrine de ses longs doigts qui te transpercent en silence."));
		addTextChoice(7, 0, 0, "Arracher ton bras et tuer le chien");
		addTextChoice(7, 0, 1, "Emporter le chiens dans ta fuite");
		addTextChoice(7, 0, 2, "");
			
		addTextStory(7, 1, backLine("Tu t'avances prudemment dans sa direction, tu aperçois une louve encerclée de pierre où l’un ses louveteaux meurtrie agonise. Elle semble réclamer ton aide, mais l’ombre est déjà là, entourant ton corps de ses bras. Portant son attention sur la louve il ne s’intéresse plus à toi et se place maintenant devant entre toi et l'animal te traversant sans peine. Ton souffle se coupe alors que tu le vois arracher le cœur d’un autre louveteau."));
		addTextChoice(7, 1, 0, "Courir en profitant de son occupation");
		addTextChoice(7, 1, 1, "Traverser le monstre et sauver la louve");
		addTextChoice(7, 1, 2, "");
			
		addTextStory(7, 2, backLine("Tu t'avances prudemment dans sa direction, tu aperçois une femme s’accrochant au bord d’un ravin sans fond. Elle hurle des paroles incompréhensibles alors que tu lui tend la main, elle se transforme petit à petit en pierre. Paniquée,  elle se débat, te faisant tomber tu arrives à te raccrocher.  Essayant de la faire remonter difficilement, l’ombre fait son apparition tendant ses longs bras vers vos poitrines."));
		addTextChoice(7, 2, 0, "La pousser pour remonter et courir");
		addTextChoice(7, 2, 1, "Vous laisser tomber tout les deux");
		addTextChoice(7, 2, 2, "");

		addTextStory(7, 3, backLine("Tu t'avances prudemment dans sa direction, tu aperçois une jeune fille accrochée à la paroi d'un large ravin, elle te tend la main désespérément. La mousse s'agite à chacune de ses paroles que tu ne peu comprendre. Mais il te faut la sortir d'ici, tu tends alors ta main mais un vent froid te fait vaciller, tu tombes à la renverse l’entraînant dans ta chute. Par chance tu réussis à te rattraper de justesse, elle est maintenant accrochée a ton pied. Tu peux la remonter mais cela sera au risque de ta vie."));
		addTextChoice(7, 3, 0, "La remonter");
		addTextChoice(7, 3, 1, "La faire tomber et remonter");
		addTextChoice(7, 3, 2, "");
		
		addTextStory(7, 4, backLine("La main qui t'es tendu est frêle et jeune, elle tremble au son des murmures incessant qui entourent maintenant la pièce. Les rayons de la lune se reflètes sur la pierre. Cette main seule comme tu peux l'être à ce moment semble être ton seul recourt à ce tombeau de solitude. Tu attrapes cette main, désespéré, mais ton bras ce transforme en pierre. Tu te retournes, l'ombre est là à quelques mètres de toi."));
		addTextChoice(7, 4, 0, "Essayer de te dégager");
		addTextChoice(7, 4, 1, "Tirer pour sortir l'humain");
		addTextChoice(7, 4, 2, "");
		
		addTextStory(7, 5, backLine("Tu piétines les cadavres redonnant vie à ces membres pour certains arrachés. Arrivant enfin sur cette montagne d'horreur avec difficulté, tu laisses les rayons de la lune caresser ton visage par la grande ouverture sur le ciel qui t'es offerte. La lune est d'une beauté insaisissable, l'air fait danser tes cheveux et l'espoir d'un échappatoire renaît enfin. Mais l'ombre s'approche et il te faut faire un choix."));
		addTextChoice(7, 5, 0, "Continuer tout droit");
		addTextChoice(7, 5, 1, "Essayer de monter pour aller à l'extérieur");
		addTextChoice(7, 5, 2, "");
		
		
		
		
		addTextStory(8, 0, backLine("Il ne te restes qu'une solution : courir, tes membres engourdis t'empêche de réaliser l'effort souhaiter alors que tu entend l'être derrière toi se transformer en pierre. Et de peur de connaître ce même sort, tu te réfugie dans une alcôve. Une pierre bouge, il te faut saisir cette occasion, tu t'engouffres dans une brèche et sans te retourner tu continue ton chemin, essoufflé, tu te retrouves face à une intersection."));
		addTextChoice(8, 0, 0, "Prendre à gauche");
		addTextChoice(8, 0, 1, "Prendre à droite");
		addTextChoice(8, 0, 2, "");

		addTextStory(8, 1, backLine("Tu traverses le monstre protégeant l'animal blessé. Ton souffle en est coupé et ton sang se glace à son contact. Tu prends alors la fuite sans attendre plus longtemps de peur de perdre la vie. L'animal gémit de douleur à chaque foulé que tu entreprends. Mais peu importe tu ne pouvais pas laisser cet être mourir. Ta solitude t’y a sûrement pousser mais la vie sous toutes ses formes tes précieuse. Mais sans regarder ton chemin, tu t'écroules dans une grande ouverture au sol. Tu tombes. Le vide est presque agréable après ce que tu viens de subir, la mort est-t-elle peut être la meilleure solution.  Mais c'est la mousse qui t’accueille de son duvet filandreux. Tu laisses quelques instants ton corps reprendre des forces, tu te relèves difficilement. L'animal lui n’a pas survécu à la chute son corps gît a coté de toi."));
		addTextChoice(8, 1, 0, "Prendre à gauche");
		addTextChoice(8, 1, 1, "Prendre à droite");
		addTextChoice(8, 1, 2, "");
		
		addTextStory(8, 2, backLine("Dans un élan de survie tu sacrifies cet être pour te sauver. Remontant difficilement la roche tu te retrouves face à l'ombre te tendant ses bras pour t’accueillir dans la souffrance. Tu n'as plus le choix tu dois le traverser , tu sens alors ton cœur se glacer à son contact et des cris lointains te parviennent. Tu cours de toutes tes forces là où tu penses être en sécurité dans des couloirs qui te paraissent de plus en plus sombre. La mousse se fait rare maintenant. C'est alors que tu te retrouves face à une intersection."));
		addTextChoice(8, 2, 0, "Prendre à gauche");
		addTextChoice(8, 2, 1, "Prendre à droite");
		addTextChoice(8, 2, 2, "");
		
		addTextStory(8, 3, backLine("Le vide, le vide t’emporte, ton corps flotte quelques instants, comme si tes derniers instants se devaient apaisant avant la mort dur et violente qui semble t'attendre. Tu fermes les yeux comme pour sentir la fin s'approcher. Ton corps tombe au sol. Mais c'est la mousse qui t’accueille de son duvet filandreux. Tu laisses quelques instants ton corps reprendre des forces. Hélas à coté de toi l'humain n'a pas eu cette chance. Son corps est embroché sur une pierre aiguisées. Tu recules horrifié. Il te faut avancer maintenant, car tu entrevois dans la pénombre une ouverture dans cette cavité, celle ci t'amène face à une intersection."));
		addTextChoice(8, 3, 0, "Prendre à gauche");
		addTextChoice(8, 3, 1, "Prendre à droite");
		addTextChoice(8, 3, 2, "");
		
		addTextStory(8, 4, backLine("Le monstre s'empare de toi; plongeant ses mains dans ta poitrine douloureuse, caressant ton cœur qui s’arrête petit à petit de battre. La pierre prend vie en toi, mais ce sentiment toujours présent te pousse à te dégager violemment, t’accrochant au membre arrachés tu réussis à t'échapper et à rejoindre l'autre coté de cette montagne d'horreur. Tu t'élances dans cette végétation mystérieuse. Suivant ce chemin tu te retrouves face à une intersection les deux chemins pourtant inaccessibles car les lianes recouvrent les ouvertures, enlaçant ton échappatoire."));
		addTextChoice(8, 4, 0, "Prendre à gauche");
		addTextChoice(8, 4, 1, "Prendre à droite");
		addTextChoice(8, 4, 2, "");
		
		addTextStory(8, 5, backLine("Tu dégages tes membres de ce tas d’immondices, et dévales la pente de cette montagne de cadavre. Devant toi, un tapis de mousse s'étale comme pour t'indiquer le chemin à prendre. Tu n'attends pas une seconde de plus et tu t’élances dans cette végétation mystérieuse. Suivant ce chemin tu te retrouves face a une intersection les deux chemins te sont inaccessibles car les lianes recouvrent les ouvertures enlaçant ton échappatoire."));
		addTextChoice(8, 5, 0, "Prendre à gauche");
		addTextChoice(8, 5, 1, "Prendre à droite");
		addTextChoice(8, 5, 2, "");
		
		addTextStory(8, 6, backLine("Tes mains s’agrippent désespérément à la roche coupante, tu réussis à gravir quelques mètres avec difficulté, la sortie est proche, tu le vois, tu réunis tes forces, mais ton pied refuse de bouger. Baissant la tête pour comprendre le problème, tu aperçois les cadavres de pierre mouvants et grimpant pour t'atteindre. Une petite fille à l'air innocent retient ta jambe en otage, impossible de t'échapper. Leurs corps froids t'atteignent enfin, emporté par  par la pierre il n'y a plus d'espoir possible. Le monstre plonge alors ses mains dans ton corps meurtris et en arrache ton cœur. Tes yeux se ferment de douleur, et la pénombre t'emporte à tous jamais."));
		addTextChoice(8, 6, 0, "");
		addTextChoice(8, 6, 1, "");
		addTextChoice(8, 6, 2, "");
		
		
		
		addTextStory(9, 0, backLine("Impossible de passer, tu te retournes pétrifié de sentir la mort si proche. Sur la pierre derrière toi est inscrit l'histoire de la pierre volant les âmes et les cœurs pour prendre vie envieuse de ses êtres aux sentiments si purs, créant un monstre fait d'âme torturés espérant faire de lui le messager et l'esclave de sa quête. Tu repenses à cet être que tu aurais peut-être pu sauver car maintenant c'est à ton tour de connaître ce sort, l'ombre s'approche lentement de toi, tu frémit de voir son visage afficher ce sourire terrifiant. Tu t'écroules, des milliers de questions te reviennent : n'y avait-il pas d'autres alternatives à tout cela ? Si tes choix avaient été différents aurait tu mérité de vivre ? Tu ne le sauras pas et c'est là que le destin ce doit rassurant : cela devait ce passer ainsi. Ces derniers mots résonne en toi, alors que l'ombre plonge ses mains et arrache ce cœur qui t’était si précieux. Tes membres se transforme petit a petit en une pierre froide qui ne laissera de toi que de la poussière."));
		addTextChoice(9, 0, 0, "");
		addTextChoice(9, 0, 1, "");
		addTextChoice(9, 0, 2, "");

		addTextStory(9, 1, backLine("La route est difficile mais tu atteins enfin une grande salle remplies de pierre amoncelées, trébuchant sur l'une d'elle tu t'affale alors à terre. Tournant la tête difficilement une pierre fendu se présente à toi, un cœur putride s'y trouve encastré, sans vie. Levant la tête tu aperçois sur la voûte l'histoire de la pierre, volant les âmes et les cœurs pour prendre vie envieuse de ces êtres aux sentiments si purs, créant un monstre fait d'âme torturées espérant faire de lui le messager et l'esclave de sa quête. Les rochers roulent, et t'entourent, tranchant ta peau de toute part. La douleur est si intense que tu manques de perdre connaissance, ton souffle se fait court, mais tu sais au fond de toi que tu ne peux regretter ces choix qui sont maintenant ton seul refuge rassurant. L'ombre s'avance et arrache le cœur encore chaud battant dans ta poitrine. Le silence t'entoure et la mort t'emporte doucement."));
		addTextChoice(9, 1, 0, "");
		addTextChoice(9, 1, 1, "");
		addTextChoice(9, 1, 2, "");

		addTextStory(9, 2, backLine("La route est difficile mais la lumière se fait de plus en plus proche; la lune, de ses rayons éclaire la forêt environnante. Regardant derrière toi tu peux y voir inscrit sur les rochers de cette entrée l'histoire de la pierre volant les âmes et les cœurs pour prendre vie, envieuse de ces êtres aux sentiments si purs, créant un monstre fait d'âme torturées espérant faire de lui le messager et l'esclave de sa quête. Tu es soulagé d'être enfin sortie de cette enfer qui te semblais interminable. Tu repenses alors, à tous les choix que tu as dû faire pour réussir à vivre, car même si certains étaient difficile et te resteront douloureux tu sais aujourd'hui qu’ils étaient les meilleurs décisions à prendre. Les sacrifices que tu as du faire resteront gravés en toi à jamais, mais l'espoir qu'il t'es permis de vivre est d'une valeur inestimable. Tu avances alors dans la végétations pour quitter enfin l’effrayante aventure que tu viens de vivre. Chaque pas que tu fais vers la vie est une libération, un sourire au coin des lèvres tu t’éloignes enfin pour toujours de la mort et de la souffrance."));
		addTextChoice(9, 2, 0, "");
		addTextChoice(9, 2, 1, "");
		addTextChoice(9, 2, 2, "");
	
	
	
	
	
	
	}
	
	
	public String[] checkText(int t1, int t2){
		return this.story[t1][t2];
	}
	
	public String checkChoice(int t1, int t2, int t3){
		return this.choice[t1][t2][t3];
	}
	
	public void addTextStory(int t1, int t2, String[] text){
		this.story[t1][t2]=text;
	}
	
	public void addTextChoice(int t1, int t2, int t3, String text){
		this.choice[t1][t2][t3]=text;
	}
	
	public String[] backLine(String text){
		//58
		if(text.length()>80){
			int nb=text.length()/80;
			int i=1;
			int mark[] = new int[nb];
			int oldSpacing=0;
			String resultText[] = new String[nb+1];
			while(i<=nb){
				mark[i-1]=(text.length()*i)/nb;
				i++;
			}
			for(int j=0;j<mark.length;j++){
				if(j==0){
					int spacing=0;
					for(int k=0;k<10;k++){
						if(text.charAt((mark[j]-1)+k)==' '){
							spacing=k;
						}
					}
					resultText[j]=text.substring(0, mark[j]+spacing);
					oldSpacing=spacing;
				}else{
					int spacing=0;
					for(int k=0;k<10;k++){
						if(text.charAt((mark[j]-1)-k)==' '){
							spacing=k;
						}
					}
					if(j==1){
						resultText[j]=text.substring(mark[j-1]+oldSpacing, mark[j]-spacing);
					}else{
						resultText[j]=text.substring(mark[j-1]-oldSpacing, mark[j]-spacing);
					}
					
					oldSpacing=spacing;
				}
			}
			resultText[nb]=text.substring(mark[nb-1]-oldSpacing, text.length());
			return resultText;
		}else{
			String resultText[] = new String[1];
			resultText[0]=text;
			return resultText;
		}
		
		
		
	}


	public void tick() {
		
	}


	public void render(Graphics g) {
		if(Game.gameState==State.Game){
			this.actualText=checkText(Game.storyLine, Game.storyColumn);
			g.setColor(Color.WHITE);
			if(this.actualText.length>=25){
				g.setFont(new Font("Dialog", Font.BOLD, 16));
				this.heightText=g.getFontMetrics().getHeight();
			}else if(this.actualText.length>=20 && this.actualText.length < 35){
				g.setFont(new Font("Dialog", Font.PLAIN, 16));
				this.heightText=g.getFontMetrics().getHeight();
			}else{
				g.setFont(new Font("Dialog", Font.PLAIN, 17));
				this.heightText=g.getFontMetrics().getHeight();
			}

			for(int i=0;i<this.actualText.length; i++){
				g.drawString(this.actualText[i], this.x, this.heightText*(i+1));
			}
		}
		
		
	}

}
