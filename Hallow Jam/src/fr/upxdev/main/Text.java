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
		addTextStory(0, 0, backLine("Il fait froid, l'ombre entoure ton corps endolorie, le sol froid paralyse ta joue d�j� glac�e. L'�puisement est ma�tre de tes membres et ta t�te ne semble qu'� peine te r�pondre. Tu l�ves difficilement les yeux afin de d�couvrir le lieu dans lequel tu te trouves sans arriver � discerner correctement tous les d�tails, tu remarques qu'une mousse fluorescente recouvre les parois de lourdes pierres semblant former un long couloir sombre. Les questions t�assaillent mais impossible de te souvenirs de la mani�re dont tu as pu atterrir ici. Tu te l�ves p�niblement mais le souffle glacial du tunnel engourdie tes jambes d�j� tremblantes. Tu ne peux pas rester ici tu le sais mais que faire alors que tu ne sais pas ou tu es ..."));
		addTextChoice(0, 0, 0, "Te retourner et regarder autour de toi");
		addTextChoice(0, 0, 1, "Avancer dans le long couloir en face de toi");
		addTextChoice(0, 0, 2, "");
		
		
	
		addTextStory(1, 0, backLine("Tu te retourne doucement afin de pouvoir distinguer l'�trange masse que tu as remarqu� du coin de l��il. C'est une femme, ou du moins le corps d'une femme dont les membres semble �tre fait de pierres. Pourtant sa poitrine ouverte et ensanglant�e te permet de voir que son c�ur ni prend plus place. Effray� et horrifi� par ce terrible spectacle il ne te prend qu'une envie�: c'est de sortir d'ici. Tu avances alors difficilement dans le couloir inqui�tant, le soutient de la pierre est presque r�confortant, comme une pr�sence mystique te venant en aide dans ce terrible chemin. C'est alors que tu vois, au loin, une silhouette qui te semblerait presque humaine. C'est un �lan d'inqui�tude et d'espoir qui s'empare de toi. Tu tente de crier mais aucun son ne peut sortir de ta bouche. C'est paralys� que tu restes un moment � regarder la masse noir avancer elle aussi vers toi. Tu plisses les yeux inqui�t� par ce qui s'approche. Un tremblement presque imperceptible s'�chappe de la roche et un murmure discret s'en �chappe, mais impossible de savoir si ce son est celui d'une femme en d�tresse ou du vent qui caresse la mousse."));
		addTextChoice(1, 0, 0, "Attendre de pouvoir distinguer l'�tre devant toi");
		addTextChoice(1, 0, 1, "Se cacher dans une alc�ve");
		addTextChoice(1, 0, 2, "");
		
		addTextStory(1, 1, backLine("Tu avances alors difficilement dans le couloir inqui�tant, le soutient de la pierre est presque r�confortant, comme si une pr�sence mystique te venant en aide dans ce terrible chemin. C'est alors que tu vois�, au loin, une silhouette qui te semblerait presque humaine. C'est un �lan d'inqui�tude et d'espoir qui s'empare de toi. Tu tente de crier mais aucun son ne peut sortir de ta bouche. C'est paralys� que tu restes un moment � regarder la masse noir avancer elle aussi vers toi. Tu plisses les yeux inqui�t� par ce qui s'approche. Un tremblement presque imperceptible s'�chappe de la roche et un murmure discret s'en �chappe, mais impossible de savoir si ce son est celui d'une femme en d�tresse ou du vent qui caresse la mousse."));
		addTextChoice(1, 1, 0, "Attendre de pouvoir distinguer l'�tre devant toi");
		addTextChoice(1, 1, 1, "Se cacher dans une alc�ve");
		addTextChoice(1, 1, 2, "");
		
		
		
		addTextStory(2, 0, backLine("Tu es p�trifi� par la vision de l'�tre qui ce tien devant toi. Une grande masse noir s'avance lentement, il n'est qu'a quelque m�tres de toi caressant la pierre de ces longues mains funestes dont les doigts disparaissent dans les interstices. Son visage aussi sombre que le reste de son corps laisse ressortis un sourire aux dents ac�r�es et aux yeux semblable � de grand vides pr�s � engloutir ce sur quoi ils jettent leurs d�volus. Plus que quelques centim�tres , il s�arr�te devant toi, apeur� tu aimerais t�enfuir mais impossible, ton corps ne te r�pond plus. Il s'avance alors et te traverse sans peine.Ton souffle en ai coup�  tu t��croules alors choqu�, plus que jamais �puiser. Tu n'oses te retourner et sentir la mort t'entourer d'un draps noir. L'envie de vivre est trop grande , tu te saisis de tes derni�res forces pour courir."));
		addTextChoice(2, 0, 0, "[CONTINUER]");
		addTextChoice(2, 0, 1, "");
		addTextChoice(2, 0, 2, "");
		
		addTextStory(2, 1, backLine("Un pressentiment s'empare de toi, soudainement, tu remarques sur le c�t� une alc�ve de la taille d'un humain, tu t'y pr�cipites alors terroris�. La chose se rapproche de toi, tu le sens, mais le doute persiste alors que tu peux enfin distinguer l'�tre parcourant ces lieux. Une grande masse noire passe alors devant toi lentement de ces longues mains funestes il caresse les pierres alors que ses doigts disparaissent dans les interstices. Son visage aussi sombre que le reste de son corps d'un noir terrifiant laisse ressortir un sourire aux dents ac�r�es et aux yeux semblable � de grands vides pr�s � engloutir ce sur quoi ils jettent leurs d�volus. Coll� � la pierre tu aimerais dispara�tre face � ce que l�on pourrait appeler un monstre terrifiant. Il s'�loigne, tu le sens, c'est ta chance tu cours dans la direction oppos�e de toutes tes forces."));
		addTextChoice(2, 1, 0, "[CONTINUER]");
		addTextChoice(2, 1, 1, "");
		addTextChoice(2, 1, 2, "");
		
		
		
		addTextStory(3, 0, backLine("Absolument magnifique, la grotte dans laquelle tu te trouves maintenant ne peut �tre qualifi�e que d'un seul mot. Tu te trouves face � une grande �tendu d'eau, de grandes ouvertures laisse les rayons de la lune caresser la surface. La lumi�re miroitant sur les soubresauts de l'eau d'un bleu m�lang� de blanc laisse s��chapper des scintillements. Ces �clats de diamants se refl�tent sur tous les rochers l'entourant de leurs corps imposant. L'eau paisible est le c�ur de ce lieux enivrant. De grandes pierres s��lancent du sol de toute part laissant appara�tre des cristaux d'un bleu clair presque pur, alors que la v�g�tation les recouvres de ses lianes prot�geant ce tr�sor de beaut�. Les galet polis, et couvert de mousse, jonche le sol maintenant accueillant tel un lit de nature tendant ses bras vers ton corps meurtri. Tes yeux ne peuvent ce d�tacher de ce lac vivant de la lune, tu y aper�ois une grande pierre semblant flotter sur l'eau ou des images antiques s'y dessine. L'apaisement que te provoque ce spectacle de puret� absolue touche ton c�ur que tu entend battre doucement. Tes genoux appel�s par la mousse tombe alors, pour enfin atteindre la douceur et le calme de ce lieux. Tu fermes alors les yeux un instant comme pour te sentir reprendre vie, ta respiration se calme lentement alors que tu entends encore ce murmure �trange. Mais un vent froid te glace le sang, tu te retournes violemment et manque de tomber, tu aper�ois l'ombre s'approcher, il te faut t'�chapper, regardant autour de toi tu aper�ois deux grandes ouvertures de chaque cot�s du lac."));
		addTextChoice(3, 0, 0, "Prendre le couloir de gauche");
		addTextChoice(3, 0, 1, "Prendre le couloir de droite");
		addTextChoice(3, 0, 2, "Nager vers la pierre ");
		
		
		
		addTextStory(4, 0, backLine("Paniqu� tu cours sur les galets qui t��corchent maintenant la peau, tu arrives face � ce couloir aussi sombre que le premier, tu t'y engouffres sans attendre te retrouvant face � une �norme pierre qui te laisse entrevoir des rayons lumineux de l'autre c�t� mais tu ne sais comment la passer."));
		addTextChoice(4, 0, 0, "Essayer de pousser la pierre");
		addTextChoice(4, 0, 1, "Retourner en arri�re");
		addTextChoice(4, 0, 2, "");
		
		addTextStory(4, 1, backLine("Paniqu� tu cours sur les galets qui t��corchent maintenant la peau, tu arrives face � ce couloir aussi sombre que le premier, tu t'y engouffres sans attendre te retrouvant face � un mur de v�g�tation qui te laisse entrevoir d'�tranges rayons lumineux mais tu ne sais comment passer ces lianes entrelac�es."));
		addTextChoice(4, 1, 0, "Retourner en arri�re");
		addTextChoice(4, 1, 1, "Essayer d'arracher les lianes");
		addTextChoice(4, 1, 2, "");
		
		addTextStory(4, 2, backLine("Paniqu� tu sautes dans l'eau nageant de toutes tes forces, peut �tre que l'ombre ne pourras pas te rattraper , c'est ce que tu esp�res du moins. Tu atteins enfin la rive , le rocher imposant que tu avais aper�u se fait plus nette te laissant voir � travers les feuilles le dessin d'une statue de femme tendant la main vers deux amoureux s'embrassant. Le dessin qui le suis est celle de cette statue le c�ur de la jeune fille morte dans les main essayant d�sesp�r�ment d'en faire son propre c�ur."));
		addTextChoice(4, 2, 0, "[CONTINUER]");
		addTextChoice(4, 2, 1, "");
		addTextChoice(4, 2, 2, "");
		
		
		
		addTextStory(5, 0, backLine("Tu retournes alors en arri�re mais l'ombre est d�j� l� tendant les mains vers ta poitrine il t�effleure alors que tu plonges dans l'eau, une douleur s�empare de ton c�ur mais tu arrives � nager jusqu�� la grande pierre."));
		addTextChoice(5, 0, 0, "CONTINUER");
		addTextChoice(5, 0, 1, "");
		addTextChoice(5, 0, 2, "");
		
		
		
		addTextStory(6, 0, backLine("Tes mains tentent de trouver une accroche sur la pierre tranchante glissant sur tes poignets maintenant ensanglant�s. La pierre peine � se d�caler mais elle semble bouger du moins assez pour que tu puisses t'y faufiler, la pierre se r�chauffe alors br�lant ton bras alors que tu tentes de t'extirper. Entendant un grand bruit tu te retourne et constate que la pierre s�ouvre d'elle m�me. Tu te retrouve encore dans un long couloir, enivr� par la peur tu cours jusqu�� une petite salle o� se trouve une grande dalle laissant deviner le dessin d'une statue de femme tendant la main vers deux amoureux s'embrassant. Le dessins qui le suis est celui de cette statue portant le c�ur de la jeune fille morte dans ses mains et essayant d�sesp�r�ment d'en faire son propre c�ur. Au loin tu entends deux cris, celui d'une louve apeur�e et d'un chien en souffrance."));
		addTextChoice(6, 0, 0, "Aller vers le chien");
		addTextChoice(6, 0, 1, "Aller vers la louve");
		addTextChoice(6, 0, 2, "");
		
		addTextStory(6, 1, backLine("Tu plonges tes mains d�sesp�r�ment dans les feuilles, te br�lant les mains alors que tu arraches les lianes qui tombent au sol laissant s'�chapper un liquide rouge et sirupeux. L'ouverture est maintenant assez grande pour que tu puisses passer, pendant que les lianes bougent comme pour reprendre leurs places initiales, tu te retrouves encore dans un long couloir �vitant les lianes s�avan�ant vers toi et tendant leurs feuilles empoisonn�es. �vitant leurs tiges mouvantes, tu arrives jusqu'� une petite salle o� se trouve une grande dalle laissant deviner le dessin d'une statue de femme tendant la main vers deux amoureux s'embrassant. Le dessins qui le suis est celui de cette statue portant le c�ur de la jeune fille morte dans ses mains et essayant d�sesp�r�ment d'en faire son propre c�ur. Au loin le cris d'une m�re apeur�e et celui d'une petite fille en d�tresse te parviennent."));
		addTextChoice(6, 1, 0, "Aller vers  la m�re");
		addTextChoice(6, 1, 1, "Aller vers la petite fille");
		addTextChoice(6, 1, 2, "");
		
		addTextStory(6, 2, backLine("Derri�re la pierre se dresse un long couloir, c'est ta chance, tu t'y lances sans attendre, au loin un monticule pour l'instant trop flou est �clair� par la lune. Les murmures se font de plus en plus nette \"vivre... je veux vivre...\" murmurent les pierres. Tu arrives enfin pr�s du monticule , horrifi� tu distingues des cadavres empil�s la poitrine ouverte et sans c�ur, tu recules paniqu�, leurs membres sont pour certains transform�s en pierre. C'est alors que tu tends l'oreille, une petite voix appelle � l'aide tu en es s�r, une main se mouvant � travers les cadavres t'apparais alors."));
		addTextChoice(6, 2, 0, "Attraper la main");
		addTextChoice(6, 2, 1, "Surmonter  l'amas de cadavres");
		addTextChoice(6, 2, 2, "");
		
		
		
		addTextStory(7, 0, backLine("Tu t'avances prudemment dans sa direction, tu aper�ois un chien te regardant de ses yeux souffrants. Tu te rapproches alors le caressant pour le rassurer. Mais sans attendre il mord ton bras pris au pi�ge impossible de le bouger alors qu'il se transforme en pierre. L�ombre se rapproche et souffle un vent glacial sur ta peau. Tu te d�bats mais l�ombre caresse ta poitrine de ses longs doigts qui te transpercent en silence."));
		addTextChoice(7, 0, 0, "Arracher ton bras et tuer le chien");
		addTextChoice(7, 0, 1, "Emporter le chiens dans ta fuite");
		addTextChoice(7, 0, 2, "");
			
		addTextStory(7, 1, backLine("Tu t'avances prudemment dans sa direction, tu aper�ois une louve encercl�e de pierre o� l�un ses louveteaux meurtrie agonise. Elle semble r�clamer ton aide, mais l�ombre est d�j� l�, entourant ton corps de ses bras. Portant son attention sur la louve il ne s�int�resse plus � toi et se place maintenant devant entre toi et l'animal te traversant sans peine. Ton souffle se coupe alors que tu le vois arracher le c�ur d�un autre louveteau."));
		addTextChoice(7, 1, 0, "Courir en profitant de son occupation");
		addTextChoice(7, 1, 1, "Traverser le monstre et sauver la louve");
		addTextChoice(7, 1, 2, "");
			
		addTextStory(7, 2, backLine("Tu t'avances prudemment dans sa direction, tu aper�ois une femme s�accrochant au bord d�un ravin sans fond. Elle hurle des paroles incompr�hensibles alors que tu lui tend la main, elle se transforme petit � petit en pierre. Paniqu�e,  elle se d�bat, te faisant tomber tu arrives � te raccrocher.  Essayant de la faire remonter difficilement, l�ombre fait son apparition tendant ses longs bras vers vos poitrines."));
		addTextChoice(7, 2, 0, "La pousser pour remonter et courir");
		addTextChoice(7, 2, 1, "Vous laisser tomber tout les deux");
		addTextChoice(7, 2, 2, "");

		addTextStory(7, 3, backLine("Tu t'avances prudemment dans sa direction, tu aper�ois une jeune fille accroch�e � la paroi d'un large ravin, elle te tend la main d�sesp�r�ment. La mousse s'agite � chacune de ses paroles que tu ne peu comprendre. Mais il te faut la sortir d'ici, tu tends alors ta main mais un vent froid te fait vaciller, tu tombes � la renverse l�entra�nant dans ta chute. Par chance tu r�ussis � te rattraper de justesse, elle est maintenant accroch�e a ton pied. Tu peux la remonter mais cela sera au risque de ta vie."));
		addTextChoice(7, 3, 0, "La remonter");
		addTextChoice(7, 3, 1, "La faire tomber et remonter");
		addTextChoice(7, 3, 2, "");
		
		addTextStory(7, 4, backLine("La main qui t'es tendu est fr�le et jeune, elle tremble au son des murmures incessant qui entourent maintenant la pi�ce. Les rayons de la lune se refl�tes sur la pierre. Cette main seule comme tu peux l'�tre � ce moment semble �tre ton seul recourt � ce tombeau de solitude. Tu attrapes cette main, d�sesp�r�, mais ton bras ce transforme en pierre. Tu te retournes, l'ombre est l� � quelques m�tres de toi."));
		addTextChoice(7, 4, 0, "Essayer de te d�gager");
		addTextChoice(7, 4, 1, "Tirer pour sortir l'humain");
		addTextChoice(7, 4, 2, "");
		
		addTextStory(7, 5, backLine("Tu pi�tines les cadavres redonnant vie � ces membres pour certains arrach�s. Arrivant enfin sur cette montagne d'horreur avec difficult�, tu laisses les rayons de la lune caresser ton visage par la grande ouverture sur le ciel qui t'es offerte. La lune est d'une beaut� insaisissable, l'air fait danser tes cheveux et l'espoir d'un �chappatoire rena�t enfin. Mais l'ombre s'approche et il te faut faire un choix."));
		addTextChoice(7, 5, 0, "Continuer tout droit");
		addTextChoice(7, 5, 1, "Essayer de monter pour aller � l'ext�rieur");
		addTextChoice(7, 5, 2, "");
		
		
		
		
		addTextStory(8, 0, backLine("Il ne te restes qu'une solution : courir, tes membres engourdis t'emp�che de r�aliser l'effort souhaiter alors que tu entend l'�tre derri�re toi se transformer en pierre. Et de peur de conna�tre ce m�me sort, tu te r�fugie dans une alc�ve. Une pierre bouge, il te faut saisir cette occasion, tu t'engouffres dans une br�che et sans te retourner tu continue ton chemin, essouffl�, tu te retrouves face � une intersection."));
		addTextChoice(8, 0, 0, "Prendre � gauche");
		addTextChoice(8, 0, 1, "Prendre � droite");
		addTextChoice(8, 0, 2, "");

		addTextStory(8, 1, backLine("Tu traverses le monstre prot�geant l'animal bless�. Ton souffle en est coup� et ton sang se glace � son contact. Tu prends alors la fuite sans attendre plus longtemps de peur de perdre la vie. L'animal g�mit de douleur � chaque foul� que tu entreprends. Mais peu importe tu ne pouvais pas laisser cet �tre mourir. Ta solitude t�y a s�rement pousser mais la vie sous toutes ses formes tes pr�cieuse. Mais sans regarder ton chemin, tu t'�croules dans une grande ouverture au sol. Tu tombes. Le vide est presque agr�able apr�s ce que tu viens de subir, la mort est-t-elle peut �tre la meilleure solution.  Mais c'est la mousse qui t�accueille de son duvet filandreux. Tu laisses quelques instants ton corps reprendre des forces, tu te rel�ves difficilement. L'animal lui n�a pas surv�cu � la chute son corps g�t a cot� de toi."));
		addTextChoice(8, 1, 0, "Prendre � gauche");
		addTextChoice(8, 1, 1, "Prendre � droite");
		addTextChoice(8, 1, 2, "");
		
		addTextStory(8, 2, backLine("Dans un �lan de survie tu sacrifies cet �tre pour te sauver. Remontant difficilement la roche tu te retrouves face � l'ombre te tendant ses bras pour t�accueillir dans la souffrance. Tu n'as plus le choix tu dois le traverser , tu sens alors ton c�ur se glacer � son contact et des cris lointains te parviennent. Tu cours de toutes tes forces l� o� tu penses �tre en s�curit� dans des couloirs qui te paraissent de plus en plus sombre. La mousse se fait rare maintenant. C'est alors que tu te retrouves face � une intersection."));
		addTextChoice(8, 2, 0, "Prendre � gauche");
		addTextChoice(8, 2, 1, "Prendre � droite");
		addTextChoice(8, 2, 2, "");
		
		addTextStory(8, 3, backLine("Le vide, le vide t�emporte, ton corps flotte quelques instants, comme si tes derniers instants se devaient apaisant avant la mort dur et violente qui semble t'attendre. Tu fermes les yeux comme pour sentir la fin s'approcher. Ton corps tombe au sol. Mais c'est la mousse qui t�accueille de son duvet filandreux. Tu laisses quelques instants ton corps reprendre des forces. H�las � cot� de toi l'humain n'a pas eu cette chance. Son corps est embroch� sur une pierre aiguis�es. Tu recules horrifi�. Il te faut avancer maintenant, car tu entrevois dans la p�nombre une ouverture dans cette cavit�, celle ci t'am�ne face � une intersection."));
		addTextChoice(8, 3, 0, "Prendre � gauche");
		addTextChoice(8, 3, 1, "Prendre � droite");
		addTextChoice(8, 3, 2, "");
		
		addTextStory(8, 4, backLine("Le monstre s'empare de toi; plongeant ses mains dans ta poitrine douloureuse, caressant ton c�ur qui s�arr�te petit � petit de battre. La pierre prend vie en toi, mais ce sentiment toujours pr�sent te pousse � te d�gager violemment, t�accrochant au membre arrach�s tu r�ussis � t'�chapper et � rejoindre l'autre cot� de cette montagne d'horreur. Tu t'�lances dans cette v�g�tation myst�rieuse. Suivant ce chemin tu te retrouves face � une intersection les deux chemins pourtant inaccessibles car les lianes recouvrent les ouvertures, enla�ant ton �chappatoire."));
		addTextChoice(8, 4, 0, "Prendre � gauche");
		addTextChoice(8, 4, 1, "Prendre � droite");
		addTextChoice(8, 4, 2, "");
		
		addTextStory(8, 5, backLine("Tu d�gages tes membres de ce tas d�immondices, et d�vales la pente de cette montagne de cadavre. Devant toi, un tapis de mousse s'�tale comme pour t'indiquer le chemin � prendre. Tu n'attends pas une seconde de plus et tu t��lances dans cette v�g�tation myst�rieuse. Suivant ce chemin tu te retrouves face a une intersection les deux chemins te sont inaccessibles car les lianes recouvrent les ouvertures enla�ant ton �chappatoire."));
		addTextChoice(8, 5, 0, "Prendre � gauche");
		addTextChoice(8, 5, 1, "Prendre � droite");
		addTextChoice(8, 5, 2, "");
		
		addTextStory(8, 6, backLine("Tes mains s�agrippent d�sesp�r�ment � la roche coupante, tu r�ussis � gravir quelques m�tres avec difficult�, la sortie est proche, tu le vois, tu r�unis tes forces, mais ton pied refuse de bouger. Baissant la t�te pour comprendre le probl�me, tu aper�ois les cadavres de pierre mouvants et grimpant pour t'atteindre. Une petite fille � l'air innocent retient ta jambe en otage, impossible de t'�chapper. Leurs corps froids t'atteignent enfin, emport� par  par la pierre il n'y a plus d'espoir possible. Le monstre plonge alors ses mains dans ton corps meurtris et en arrache ton c�ur. Tes yeux se ferment de douleur, et la p�nombre t'emporte � tous jamais."));
		addTextChoice(8, 6, 0, "");
		addTextChoice(8, 6, 1, "");
		addTextChoice(8, 6, 2, "");
		
		
		
		addTextStory(9, 0, backLine("Impossible de passer, tu te retournes p�trifi� de sentir la mort si proche. Sur la pierre derri�re toi est inscrit l'histoire de la pierre volant les �mes et les c�urs pour prendre vie envieuse de ses �tres aux sentiments si purs, cr�ant un monstre fait d'�me tortur�s esp�rant faire de lui le messager et l'esclave de sa qu�te. Tu repenses � cet �tre que tu aurais peut-�tre pu sauver car maintenant c'est � ton tour de conna�tre ce sort, l'ombre s'approche lentement de toi, tu fr�mit de voir son visage afficher ce sourire terrifiant. Tu t'�croules, des milliers de questions te reviennent : n'y avait-il pas d'autres alternatives � tout cela ? Si tes choix avaient �t� diff�rents aurait tu m�rit� de vivre ? Tu ne le sauras pas et c'est l� que le destin ce doit rassurant : cela devait ce passer ainsi. Ces derniers mots r�sonne en toi, alors que l'ombre plonge ses mains et arrache ce c�ur qui t��tait si pr�cieux. Tes membres se transforme petit a petit en une pierre froide qui ne laissera de toi que de la poussi�re."));
		addTextChoice(9, 0, 0, "");
		addTextChoice(9, 0, 1, "");
		addTextChoice(9, 0, 2, "");

		addTextStory(9, 1, backLine("La route est difficile mais tu atteins enfin une grande salle remplies de pierre amoncel�es, tr�buchant sur l'une d'elle tu t'affale alors � terre. Tournant la t�te difficilement une pierre fendu se pr�sente � toi, un c�ur putride s'y trouve encastr�, sans vie. Levant la t�te tu aper�ois sur la vo�te l'histoire de la pierre, volant les �mes et les c�urs pour prendre vie envieuse de ces �tres aux sentiments si purs, cr�ant un monstre fait d'�me tortur�es esp�rant faire de lui le messager et l'esclave de sa qu�te. Les rochers roulent, et t'entourent, tranchant ta peau de toute part. La douleur est si intense que tu manques de perdre connaissance, ton souffle se fait court, mais tu sais au fond de toi que tu ne peux regretter ces choix qui sont maintenant ton seul refuge rassurant. L'ombre s'avance et arrache le c�ur encore chaud battant dans ta poitrine. Le silence t'entoure et la mort t'emporte doucement."));
		addTextChoice(9, 1, 0, "");
		addTextChoice(9, 1, 1, "");
		addTextChoice(9, 1, 2, "");

		addTextStory(9, 2, backLine("La route est difficile mais la lumi�re se fait de plus en plus proche; la lune, de ses rayons �claire la for�t environnante. Regardant derri�re toi tu peux y voir inscrit sur les rochers de cette entr�e l'histoire de la pierre volant les �mes et les c�urs pour prendre vie, envieuse de ces �tres aux sentiments si purs, cr�ant un monstre fait d'�me tortur�es esp�rant faire de lui le messager et l'esclave de sa qu�te. Tu es soulag� d'�tre enfin sortie de cette enfer qui te semblais interminable. Tu repenses alors, � tous les choix que tu as d� faire pour r�ussir � vivre, car m�me si certains �taient difficile et te resteront douloureux tu sais aujourd'hui qu�ils �taient les meilleurs d�cisions � prendre. Les sacrifices que tu as du faire resteront grav�s en toi � jamais, mais l'espoir qu'il t'es permis de vivre est d'une valeur inestimable. Tu avances alors dans la v�g�tations pour quitter enfin l�effrayante aventure que tu viens de vivre. Chaque pas que tu fais vers la vie est une lib�ration, un sourire au coin des l�vres tu t��loignes enfin pour toujours de la mort et de la souffrance."));
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
