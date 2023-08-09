
/* © authors of this program, who release this file to the public domain, or
* (where not possible) under the terms of the unlicense. */


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class KingGame {


	private Random random = new Random();
	private Scanner input = new Scanner( System.in );
	private String Z = ""; // show instructions command
	private int A = 0; // money in treasury
	private int A4 = 0; // ?
	private int B = 0; // total citizens
	private int B1 = 0; // dead citizens this year ?
	private int B5 = 0; // ? citizens
	private int C = 0; // foreign worker count
	private int C1 = 0; // workers in country
	private int D = 0; // square miles of land available
	private int F1 = 0; // dead from pollution
	private int G1 = 0; // ?
	private int H = 0; // square miles sold to industry
	private int I = 0; // money given to citizens
	private int J = 0; // square miles to plant
	private int K = 0; // money spent on pollution control
	private int M6 = 0; // ?
	private int N5 = 0; // years to play
	private int P1 = 0; // ?
	private int Q = 0; // income ?
	private int T1 = 0; // ?
	private int U1 = 0; // ?
	private int U2 = 0; // crops ?
	private int V1 = 0; // trade income ?
	private int V2 = 0; // trade expenses ?
	private int V3 = 0; // ?
	private int V9 = 0; // cost to plant one square mile of land
	private int W = 0; // industry offer to buy land, by square mile
	private int X = 0; // ?
	private int X5 = 0; // years of term elapsed


	public static void main(
	String[] args
	) {
		KingGame game = new KingGame();
		game.line1();
	}


	public void line1(
	) {
		// 1 PRINT TAB(34);"KING"
		System.out.println( "\t\tKING" );
		line2();
	}


	private void line2(
	) {
		// 2 PRINT TAB(15);"CREATIVE COMPUTING MORRISTOWN, NEW JERSEY"
		System.out.println( "\tCREATIVE COMPUTING MORRISTOWN, NEW JERSEY" );
		line3();
	}


	private void line3(
	) {
		// 3 PRINT:PRINT:PRINT
		System.out.println();
		System.out.println();
		System.out.println();
		line4();
	}


	private void line4(
	) {
		// 4 PRINT "DO YOU WANT INSTRUCTIONS";
		System.out.println( "DO YOU WANT INSTRUCTIONS ?" );
		line5();
	}


	private void line5(
	) {
		// 5 INPUT Z$
		Z = input.nextLine();
		// ASK does cancel return null ?
		Z = Z.toUpperCase();
		line6();
	}


	private void line6(
	) {
		// 6 N5=8
		N5 = 8;
		System.out.println( "line6" );
		line10();
	}


	private void line10(
	) {
		String firstCharacterOfInput;
		if ( Z.isEmpty() )
			firstCharacterOfInput = "";
		else
			firstCharacterOfInput = Z.substring( 0, 1 ).toUpperCase();

		// 10 IF LEFT$(Z$,1)="N" THEN 47
		if ( firstCharacterOfInput.equals( "N" ) )
			line47();
		else
			line11();
	}


	private void line11(
	) {
		// 11 IF Z$="AGAIN" THEN 1960
		if ( Z.equals( "AGAIN" ) )
			line1960();
		else
			line12();
	}


	private void line12(
	) {
		// 12 PRINT:PRINT:PRINT
		System.out.println();
		System.out.println();
		System.out.println();
		line20();
	}


	private void line20(
	) {
		// 20 PRINT "CONGRATULATIONS! YOU'VE JUST BEEN ELECTED PREMIER OF SETATS"
		System.out.println( "CONGRATULATIONS! YOU'VE JUST BEEN ELECTED PREMIER OF SETATS" );
		line22();
	}


	private void line22(
	) {
		// 22 PRINT "DETINU, A SMALL COMMUNIST ISLAND 30 BY 70 MILES LONG. YOUR"
		System.out.println( "DETINU, A SMALL COMMUNIST ISLAND 30 BY 70 MILES LONG. YOUR" );
		line24();
	}


	private void line24(
	) {
		// 24 PRINT "JOB IS TO DECIDE UPON THE CONTRY'S BUDGET AND DISTRIBUTE"
		System.out.println( "JOB IS TO DECIDE UPON THE CONTRY'S BUDGET AND DISTRIBUTE" );
		line26();
	}


	private void line26(
	) {
		// 26 PRINT "MONEY TO YOUR COUNTRYMEN FROM THE COMMUNAL TREASURY."
		System.out.println( "MONEY TO YOUR COUNTRYMEN FROM THE COMMUNAL TREASURY." );
		line28();
	}


	private void line28(
	) {
		// 28 PRINT "THE MONEY SYSTEM IS RALLODS, AND EACH PERSON NEEDS 100"
		System.out.println( "THE MONEY SYSTEM IS RALLODS, AND EACH PERSON NEEDS 100" );
		line30();
	}


	private void line30(
	) {
		// 30 PRINT "RALLODS PER YEAR TO SURVIVE. YOUR COUNTRY'S INCOME COMES"
		System.out.println( "RALLODS PER YEAR TO SURVIVE. YOUR COUNTRY'S INCOME COMES" );
		line32();
	}


	private void line32(
	) {
		// 32 PRINT "FROM FARM PRODUCE AND TOURISTS VISITING YOUR MAGNIFICENT"
		System.out.println( "FROM FARM PRODUCE AND TOURISTS VISITING YOUR MAGNIFICENT" );
		line34();
	}


	private void line34(
	) {
		// 34 PRINT "FORESTS, HUNTING, FISHING, ETC. HALF YOUR LAND IS FARM LAND"
		System.out.println( "FORESTS, HUNTING, FISHING, ETC. HALF YOUR LAND IS FARM LAND" );
		line36();
	}


	private void line36(
	) {
		// 36 PRINT "WHICH ALSO HAS AN EXCELLENT MINERAL CONTENT AND MAY BE SOLD"
		System.out.println( "WHICH ALSO HAS AN EXCELLENT MINERAL CONTENT AND MAY BE SOLD" );
		line38();
	}


	private void line38(
	) {
		// 38 PRINT "TO FOREIGN INDUSTRY (STRIP MINING) WHO IMPORT AND SUPPORT"
		System.out.println( "TO FOREIGN INDUSTRY (STRIP MINING) WHO IMPORT AND SUPPORT" );
		line40();
	}


	private void line40(
	) {
		// 40 PRINT "THEIR OWN WORKERS. CROPS COST BETWEEN 10 AND 15 RALLODS PER"
		System.out.println( "THEIR OWN WORKERS. CROPS COST BETWEEN 10 AND 15 RALLODS PER" );
		line42();
	}


	private void line42(
	) {
		// 42 PRINT "SQUARE MILE TO PLANT."
		System.out.println( "SQUARE MILE TO PLANT." );
		line44();
	}


	private void line44(
	) {
		// 44 PRINT "YOUR GOAL IS TO COMPLETE YOUR";N5;"YEAR TERM OF OFFICE."
		System.out.println( "YOUR GOAL IS TO COMPLETE YOUR "+ N5 +" YEAR TERM OF OFFICE." );
		line46();
	}


	private void line46(
	) {
		// 46 PRINT "GOOD LUCK!"
		System.out.println( "GOOD LUCK!" );
		line47();
	}


	private void line47(
	) {
		// 47 PRINT
		System.out.println();
		line50();
	}


	private void line50(
	) {
		// 50 A=INT(60000+(1000*RND(1))-(1000*RND(1)))
		A = (int)Math.round( 60_000 + ( 1_000D * random.nextFloat() - ( 1_000 * random.nextFloat() ) ) );
		line55();
	}


	private void line55(
	) {
		// 55 B=INT(500+(10*RND(1))-(10*RND(1)))
		B = (int)Math.round( 500 + ( 10 * random.nextFloat() - ( 10 * random.nextFloat() ) ) );
		line65();
	}


	private void line65(
	) {
		// 65 D=2000
		D = 2_000;
		line100();
	}


	private void line100(
	) {
		// 100 W=INT(10*RND(1)+95)
		W = (int)Math.round( 95 + ( 10 * random.nextFloat() ) );
		line102();
	}


	private void line102(
	) {
		// 102 PRINT
		System.out.println();
		line105();
	}


	private void line105(
	) {
		// 105 PRINT "YOU NOW HAVE ";A;" RALLODS IN THE TREASURY."
		System.out.println( "YOU NOW HAVE "+ A +" RALLODS IN THE TREASURY." );
		line110();
	}


	private void line110(
	) {
		// 110 PRINT INT(B);:PRINT "COUNTRYMEN, ";
		System.out.println( B );
		System.out.println( "COUNTRYMEN, " );
		line115();
	}


	private void line115(
	) {
		// 115 V9=INT(((RND(1)/2)*10+10))
		V9 = (int)Math.round( random.nextFloat() /2 *10 +10 );
		line120();
	}


	private void line120(
	) {
		 // 120 IF C=0 THEN 140
		if ( C == 0 )
			line140();
		else
			line130();
	}


	private void line130(
	) {
		// 130 PRINT INT(C);"FOREIGN WORKERS, ";
		System.out.println( C );
		System.out.println( "FOREIGN WORKERS, " );
		line140();
	}


	private void line140(
	) {
		// 140 PRINT "AND";INT(D);"SQ. MILES OF LAND."
		System.out.println( "AND" );
		System.out.println( D );
		System.out.println( "SQ. MILES OF LAND." );
		line150();
	}


	private void line150(
	) {
		// 150 PRINT "THIS YEAR INDUSTRY WILL BUY LAND FOR";W;
		System.out.println( "THIS YEAR INDUSTRY WILL BUY LAND FOR "+ W );
		line152();
	}


	private void line152(
	) {
		// 152 PRINT "RALLODS PER SQUARE MILE."
		System.out.println( "RALLODS PER SQUARE MILE." );
		line155();
	}


	private void line155(
	) {
		// 155 PRINT "LAND CURRENTLY COSTS";V9;"RALLODS PER SQUARE MILE TO PLANT."
		System.out.println( "LAND CURRENTLY COSTS"+ V9 +"RALLODS PER SQUARE MILE TO PLANT." );
		line162();
	}


	private void line162(
	) {
		// 162 PRINT
		System.out.println();
		line200();
	}


	private void line200(
	) {
		// 200 PRINT "HOW MANY SQUARE MILES DO YOU WISH TO SELL TO INDUSTRY";
		System.out.println( "HOW MANY SQUARE MILES DO YOU WISH TO SELL TO INDUSTRY ?" );
		line210();
	}


	private void line210(
	) {
		// 210 INPUT H
		H = inputIntegerFromPlayer();
		line215();
	}


	private void line215(
	) {
		 // 215 IF H<0 THEN 200
		if ( H < 0 )
			line200();
		else
			line220();
	}


	private void line220(
	) {
		// 220 IF H<=D-1000 THEN 300
		if ( H <= ( D -1_000 ) )
			line300();
		else
			line230();
	}


	private void line230(
	) {
		// 230 PRINT "***  THINK AGAIN. YOU ONLY HAVE";D-1000;"SQUARE MILES OF FARM LAND."
		System.out.println( "***  THINK AGAIN. YOU ONLY HAVE"+ ( D -1_000 ) +" SQUARE MILES OF FARM LAND." );
		line240();
	}


	private void line240(
	) {
		// 240 IF X<>0 THEN 200
		if ( X != 0 )
			line200();
		else
			line250();
	}


	private void line250(
	) {
		// 250 PRINT:PRINT "(FOREIGN INDUSTRY WILL ONLY BUY FARM LAND BECAUSE"
		System.out.println();
		System.out.println( "(FOREIGN INDUSTRY WILL ONLY BUY FARM LAND BECAUSE" );
		line260();
	}


	private void line260(
	) {
		// 260 PRINT "FOREST LAND IS UNECONOMICAL TO STRIP MINE DUE TO TREES,"
		System.out.println( "FOREST LAND IS UNECONOMICAL TO STRIP MINE DUE TO TREES," );
		line270();
	}


	private void line270(
	) {
		// 270 PRINT "THICKER TOP SOIL, ETC.)"
		System.out.println( "THICKER TOP SOIL, ETC.)" );
		line280();
	}


	private void line280(
	) {
		// 280 X=1
		X = 1;
		line299();
	}


	private void line299(
	) {
		// 299 GOTO 200
		line200();
	}


	private void line300(
	) {
		// 300 D=INT(D-H)
		D -= H;
		line310();
	}


	private void line310(
	) {
		// 310 A=INT(A+(H*W))
		A += ( H * W );
		line320();
	}


	private void line320(
	) {
		// 320 PRINT "HOW MANY RALLODS WILL YOU DISTRIBUTE AMONG YOUR COUNTRYMEN";
		System.out.println( "HOW MANY RALLODS WILL YOU DISTRIBUTE AMONG YOUR COUNTRYMEN ?" );
		line340();
	}


	private void line340(
	) {
		// 340 INPUT I
		I = inputIntegerFromPlayer();
		line342();
	}


	private void line342(
	) {
		// 342 IF I<0 THEN 320
		if ( I < 0 )
			line320();
		else
			line350();
	}


	private void line350(
	) {
		// 350 IF I<A THEN 400
		if ( I < A )
			line400();
		else
			line360();
	}


	private void line360(
	) {
		// 360 IF I=A THEN 380
		if ( I == A )
			line380();
		else
			line370();
	}


	private void line370(
	) {
		// 370 PRINT "   THINK AGAIN. YOU'VE ONLY";A;" RALLODS IN THE TREASURY"
		System.out.println( "   THINK AGAIN. YOU'VE ONLY"+ A +" RALLODS IN THE TREASURY" );
		line375();
	}


	private void line375(
	) {
		// 375 GOTO 320
		line320();
	}


	private void line380(
	) {
		// 380 J=0
		J = 0;
		line390();
	}


	private void line390(
	) {
		// 390 K=0
		K = 0;
		line395();
	}


	private void line395(
	) {
		// 395 A=0
		A = 0;
		line399();
	}


	private void line399(
	) {
		// 399 GOTO 1000
		line1000();
	}


	private void line400(
	) {
		// 400 A=INT(A-I)
		A = A - I;
		line410();
	}


	private void line410(
	) {
		// 410 PRINT "HOW MANY SQUARE MILES DO YOU WISH TO PLANT";
		System.out.println( "HOW MANY SQUARE MILES DO YOU WISH TO PLANT" );
		line420();
	}


	private void line420(
	) {
		// 420 INPUT J
		J = inputIntegerFromPlayer();
		line421();
	}


	private void line421(
	) {
		// 421 IF J<0 THEN 410
		if ( J < 0 )
			line410();
		else
			line422();
	}


	private void line422(
	) {
		// 422 IF J<=B*2 THEN 426
		if ( J <= B *2 )
			line426();
		else
			line423();
	}


	private void line423(
	) {
		// 423 PRINT "   SORRY, BUT EACH COUNTRYMAN CAN ONLY PLANT 2 SQ. MILES."
		System.out.println( "   SORRY, BUT EACH COUNTRYMAN CAN ONLY PLANT 2 SQ. MILES." );
		line424();
	}


	private void line424(
	) {
		// 424 GOTO 410
		line410();
	}


	private void line426(
	) {
		// 426 IF J<=D-1000 THEN 430
		if ( J <= D -1_000 )
			line430();
		else
			line427();
	}


	private void line427(
	) {
		// 427 PRINT "   SORRY, BUT YOU'VE ONLY";D-1000;"SQ. MILES OF FARM LAND."
		System.out.println( "   SORRY, BUT YOU'VE ONLY "+ ( D -1_000 ) +" SQ. MILES OF FARM LAND." );
		line428();
	}


	private void line428(
	) {
		// 428 GOTO 410
		line410();
	}


	private void line430(
	) {
		// 430 U1=INT(J*V9)
		U1 = J * V9;
		line435();
	}


	private void line435(
	) {
		// 435 IF U1<A THEN 500
		if ( U1 < A )
			line500();
		else
			line440();
	}


	private void line440(
	) {
		// 440 IF U1=A THEN 490
		if ( U1 == A )
			line490();
		else
			line450();
	}


	private void line450(
	) {
		// 450 PRINT "   THINK AGAIN. YOU'VE ONLY";A;" RALLODS LEFT IN THE TREASURY."
		System.out.println( "   THINK AGAIN. YOU'VE ONLY"+ A +" RALLODS LEFT IN THE TREASURY." );
		line460();
	}


	private void line460(
	) {
		// 460 GOTO 410
		line410();
	}


	private void line490(
	) {
		// 490 K=0
		K = 0;
		line495();
	}


	private void line495(
	) {
		// 495 A=0
		A = 0;
		line499();
	}


	private void line499(
	) {
		// 499 GOTO 1000
		line1000();
	}


	private void line500(
	) {
		// 500 A=A-U1
		A = A - U1;
		line510();
	}


	private void line510(
	) {
		// 510 PRINT "HOW MANY RALLODS DO YOU WISH TO SPEND ON POLLUTION CONTROL";
		System.out.println( "HOW MANY RALLODS DO YOU WISH TO SPEND ON POLLUTION CONTROL ?" );
		line520();
	}


	private void line520(
	) {
		// 520 INPUT K
		K = inputIntegerFromPlayer();
		line522();
	}


	private void line522(
	) {
		// 522 IF K<0 THEN 510
		if ( K < 0 )
			line510();
		else
			line530();
	}


	private void line530(
	) {
		// 530 IF K<=A THEN 1000
		if ( K <= A )
			line1000();
		else
			line540();
	}


	private void line540(
	) {
		// 540 PRINT "   THINK AGAIN. YOU ONLY HAVE ";A;" RALLODS REMAINING."
		System.out.println( "   THINK AGAIN. YOU ONLY HAVE "+ A +" RALLODS REMAINING." );
		line550();
	}


	private void line550(
	) {
		// 550 GOTO 510
		line510();
	}


	private void line600(
	) {
		// 600 IF H<>0 THEN 1002
		if ( H != 0 )
			line1002();
		else
			line602();
	}


	private void line602(
	) {
		 // 602 IF I<>0 THEN 1002
		if ( I != 0 )
			line1002();
		else
			line604();
	}


	private void line604(
	) {
		// 604 IF J<>0 THEN 1002
		if ( J != 0 )
			line1002();
		else
			line606();
	}


	private void line606(
	) {
		// 606 IF K<>0 THEN 1002
		if ( K != 0 )
			line1002();
		else
			line609();
	}


	private void line609(
	) {
		// 609 PRINT
		System.out.println();
		line612();
	}


	private void line612(
	) {
		// 612 PRINT "GOODBYE."
		System.out.println( "GOODBYE." );
		line614();
	}


	private void line614(
	) {
		// 614 PRINT "(IF YOU WISH TO CONTINUE THIS GAME AT A LATER DATE, ANSWER"
		System.out.println( "(IF YOU WISH TO CONTINUE THIS GAME AT A LATER DATE, ANSWER" );
		line616();
	}


	private void line616(
	) {
		// 616 PRINT "'AGAIN' WHEN ASKED IF YOU WANT INSTRUCTIONS AT THE START"
		System.out.println( "'AGAIN' WHEN ASKED IF YOU WANT INSTRUCTIONS AT THE START" );
		line617();
	}


	private void line617(
	) {
		// 617 PRINT "OF THE GAME)."
		System.out.println( "OF THE GAME)." );
		line618();
	}


	private void line618(
	) {
		// 618 STOP
		return;
	}


	private void line1000(
	) {
		// 1000 GOTO 600
		line600();
	}


	private void line1002(
	) {
		// 1002 PRINT
		System.out.println();
		line1003();
	}


	private void line1003(
	) {
		// 1003 PRINT
		System.out.println();
		line1010();
	}


	private void line1010(
	) {
		// 1010 A=INT(A-K)
		A = A - K;
		line1020();
	}


	private void line1020(
	) {
		// 1020 A4=A
		A4 = A;
		line1100();
	}


	private void line1100(
	) {
		// 1100 IF INT(I/100-B)>=0 THEN 1120
		if ( ( I /100 ) - B >= 0 )
			line1120();
		else
			line1105();
	}


	private void line1105(
	) {
		// 1105 IF I/100<50 THEN 1700
		if ( I /100 < 50 )
			line1700();
		else
			line1110();
	}


	private void line1110(
	) {
		// 1110 PRINT INT(B-(I/100));"COUNTRYMEN DIED OF STARVATION"
		System.out.println( (int)Math.round( B - ( I /100D ) ) +" COUNTRYMEN DIED OF STARVATION" );
		line1120();
	}


	private void line1120(
	) {
		// 1120 F1=INT(RND(1)*(2000-D))
		F1 = (int)( random.nextFloat() * ( 2_000 - D ) );
		line1122();
	}


	private void line1122(
	) {
		// 1122 IF K<25 THEN 1130
		if ( K<25 )
			line1130();
		else
			line1125();
	}


	private void line1125(
	) {
		// 1125 F1=INT(F1/(K/25))
		F1 = (int)Math.round( F1 / ( K /25 ) );
		line1130();
	}


	private void line1130(
	) {
		// 1130 IF F1<=0 THEN 1150
		if ( F1 <= 0 )
			line1150();
		else
			line1140();
	}


	private void line1140(
	) {
		// 1140 PRINT F1;"COUNTRYMEN DIED OF CARBON-MONOXIDE AND DUST INHALATION"
		System.out.println( F1 +"COUNTRYMEN DIED OF CARBON-MONOXIDE AND DUST INHALATION" );
		line1150();
	}


	private void line1150(
	) {
		// 1150 IF INT((I/100)-B)<0 THEN 1170
		if ( (int)Math.round( ( I /100 ) - B ) < 0 )
			line1170();
		else
			line1160();
	}


	private void line1160(
	) {
		// 1160 IF F1>0 THEN 1180
		if ( F1 > 0 )
			line1180();
		else
			line1165();
	}


	private void line1165(
	) {
		// 1165 GOTO 1200
		line1200();
	}


	private void line1170(
	) {
		// 1170 PRINT "   YOU WERE FORCED TO SPEND";INT((F1+(B-(I/100)))*9);
		System.out.println( "   YOU WERE FORCED TO SPEND "
				+ (int)Math.round( ( F1 + ( B - ( I /100D ) ) ) *9 ) );
		line1172();
	}


	private void line1172(
	) {
		// 1172 PRINT "RALLODS ON FUNERAL EXPENSES"
		System.out.println( "RALLODS ON FUNERAL EXPENSES" );
		line1174();
	}


	private void line1174(
	) {
		// 1174 B5=INT(F1+(B-(I/100)))
		B5 = (int)Math.round( F1 + ( B - ( I /100 ) ) );
		line1175();
	}


	private void line1175(
	) {
		// 1175 A=INT(A-((F1+(B-(I/100)))*9))
		A = (int)Math.round( A - ( ( F1 + ( B - ( I /100 ) ) ) *9 ) );
		line1176();
	}


	private void line1176(
	) {
		// 1176 GOTO 1185
		line1185();
	}


	private void line1180(
	) {
		// 1180 PRINT "   YOU WERE FORCED TO SPEND ";INT(F1*9);"RALLODS ON ";
		System.out.println( "   YOU WERE FORCED TO SPEND "+ ( F1 *9 ) +"RALLODS ON " );
		line1181();
	}


	private void line1181(
	) {
		// 1181 PRINT "FUNERAL EXPENSES."
		System.out.println( "FUNERAL EXPENSES." );
		line1182();
	}


	private void line1182(
	) {
		// 1182 B5=F1
		B5 = F1;
		line1183();
	}


	private void line1183(
	) {
		// 1183 A=INT(A-(F1*9))
		A = A - ( F1 *9 );
		line1185();
	}


	private void line1185(
	) {
		// 1185 IF A>=0 THEN 1194
		if ( A >= 0 )
			line1194();
		else
			line1187();
	}


	private void line1187(
	) {
		// 1187 PRINT "   INSUFFICIENT RESERVES TO COVER COST - LAND WAS SOLD"
		System.out.println( "   INSUFFICIENT RESERVES TO COVER COST - LAND WAS SOLD" );
		line1189();
	}


	private void line1189(
	) {
		// 1189 D=INT(D+(A/W))
		D = (int)Math.round( D + ( A / W ) );
		line1190();
	}


	private void line1190(
	) {
		// 1190 A=0
		A = 0;
		line1194();
	}


	private void line1194(
	) {
		// 1194 B=INT(B-B5)
		B = B - B5;
		line1200();
	}


	private void line1200(
	) {
		// 1200 IF H=0 THEN 1250
		if ( H == 0 )
			line1250();
		else
			line1220();
	}


	private void line1220(
	) {
		// 1220 C1=INT(H+(RND(1)*10)-(RND(1)*20))
		C1 = (int)Math.round( H + ( random.nextFloat() *10 ) - ( random.nextFloat() *20 ) );
		line1224();
	}


	private void line1224(
	) {
		// 1224 IF C>0 THEN 1230
		if ( C > 0 )
			line1230();
		else
			line1226();
	}


	private void line1226(
	) {
		// 1226 C1=C1+20
		C1 = C1 +20;
		line1230();
	}


	private void line1230(
	) {
		// 1230 PRINT C1;"WORKERS CAME TO THE COUNTRY AND";
		System.out.println( C1 +"WORKERS CAME TO THE COUNTRY AND" );
		line1250();
	}


	private void line1250(
	) {
		// 1250 P1=INT(((I/100-B)/10)+(K/25)-((2000-D)/50)-(F1/2))
		P1 = (int)Math.round( ( ( I /100 - B ) /10 ) + ( K /25 ) - ( ( 2_000 - D ) /50 ) - ( F1 /2 ) );
		line1255();
	}


	private void line1255(
	) {
		// 1255 PRINT ABS(P1);"COUNTRYMEN ";
		System.out.println( Math.abs( P1 ) +" COUNTRYMEN " );
		line1260();
	}


	private void line1260(
	) {
		// 1260 IF P1<0 THEN 1275
		if ( P1 < 0 )
			line1275();
		else
			line1265();
	}


	private void line1265(
	) {
		// 1265 PRINT "CAME TO";
		System.out.println( "CAME TO" );
		line1270();
	}


	private void line1270(
	) {
		// 1270 GOTO 1280
		line1280();
	}


	private void line1275(
	) {
		// 1275 PRINT "LEFT";
		System.out.println( "LEFT" );
		line1280();
	}


	private void line1280(
	) {
		// 1280 PRINT " THE ISLAND."
		System.out.println( " THE ISLAND." );
		line1290();
	}


	private void line1290(
	) {
		// 1290 B=INT(B+P1)
		B = B + P1;
		line1292();
	}


	private void line1292(
	) {
		// 1292 C=INT(C+C1)
		C = C + C1;
		line1305();
	}


	private void line1305(
	) {
		// 1305 U2=INT(((2000-D)*((RND(1)+1.5)/2)))
		U2 = (int)Math.round( ( ( 2_000 - D ) * ( ( random.nextFloat() +1.5 ) /2D ) ) );
		line1310();
	}


	private void line1310(
	) {
		// 1310 IF J=0 THEN 1324
		if ( J == 0 )
			line1324();
		else
			line1320();
	}


	private void line1320(
	) {
		// 1320 PRINT "OF ";INT(J);"SQ. MILES PLANTED,";
		System.out.println( "OF "+ J +" SQ. MILES PLANTED," );
		line1324();
	}


	private void line1324(
	) {
		// 1324 IF J>U2 THEN 1330
		if ( J > U2 )
			line1330();
		else
			line1326();
	}


	private void line1326(
	) {
		// 1326 U2=J
		U2 = J;
		line1330();
	}


	private void line1330(
	) {
		// 1330 PRINT " YOU HARVESTED ";INT(J-U2);"SQ. MILES OF CROPS."
		System.out.println( " YOU HARVESTED "+ ( J - U2 ) +" SQ. MILES OF CROPS." );
		line1340();
	}


	private void line1340(
	) {
		// 1340 IF U2=0 THEN 1370
		if ( U2 == 0 )
			line1370();
		else
			line1344();
	}


	private void line1344(
	) {
		// 1344 IF T1>=2 THEN 1370
		if ( T1 >= 2 )
			line1370();
		else
			line1350();
	}


	private void line1350(
	) {
		// 1350 PRINT "   (DUE TO ";
		System.out.println( "   (DUE TO " );
		line1355();
	}


	private void line1355(
	) {
		// 1355 IF T1=0 THEN 1365
		if ( T1 == 0 )
			line1365();
		else
			line1360();
	}


	private void line1360(
	) {
		// 1360 PRINT "INCREASED ";
		System.out.println( "INCREASED " );
		line1365();
	}


	private void line1365(
	) {
		// 1365 PRINT "AIR AND WATER POLLUTION FROM FOREIGN INDUSTRY.)"
		System.out.println( "AIR AND WATER POLLUTION FROM FOREIGN INDUSTRY.)" );
		line1370();
	}


	private void line1370(
	) {
		// 1370 Q=INT((J-U2)*(W/2))
		Q = (int)Math.round( ( J - U2 ) * ( W /2D ) );
		line1380();
	}


	private void line1380(
	) {
		// 1380 PRINT "MAKING";INT(Q);"RALLODS."
		System.out.println( "MAKING "+ Q +" RALLODS." );
		line1390();
	}


	private void line1390(
	) {
		// 1390 A=INT(A+Q)
		A += Q;
		line1400();
	}


	private void line1400(
	) {
		// 1400 V1=INT(((B-P1)*22)+(RND(1)*500))
		V1 = (int)Math.round( ( ( B - P1 ) *22 ) + ( random.nextFloat() *500 ) );
		line1405();
	}


	private void line1405(
	) {
		// 1405 V2=INT((2000-D)*15)
		V2 = ( 2_000 - D ) *15;
		line1410();
	}


	private void line1410(
	) {
		// 1410 PRINT " YOU MADE";ABS(INT(V1-V2));"RALLODS FROM TOURIST TRADE."
		System.out.println( " YOU MADE "+ Math.abs( V1 - V2 ) +" RALLODS FROM TOURIST TRADE." );
		line1420();
	}


	private void line1420(
	) {
		// 1420 IF V2=0 THEN 1450
		if ( V2 == 0 )
			line1450();
		else
			line1425();
	}


	private void line1425(
	) {
		// 1425 IF V1-V2>=V3 THEN 1450
		if ( V1-V2 >= V3 )
			line1450();
		else
			line1430();
	}


	private void line1430(
	) {
		// 1430 PRINT "   DECREASE BECAUSE ";
		System.out.println( "   DECREASE BECAUSE " );
		line1435();
	}


	private void line1435(
	) {
		// 1435 G1=10*RND(1)
		G1 = (int)Math.round( 10 * random.nextFloat() );
		line1440();
	}


	private void line1440(
	) {
		// 1440 IF G1<=2 THEN 1460
		if ( G1 <= 2 )
			line1460();
		else
			line1442();
	}


	private void line1442(
	) {
		// 1442 IF G1<=4 THEN 1465
		if ( G1 <= 4 )
			line1465();
		else
			line1444();
	}


	private void line1444(
	) {
		// 1444 IF G1<=6 THEN 1470
		if ( G1 <= 6 )
			line1470();
		else
			line1446();
	}


	private void line1446(
	) {
		// 1446 IF G1<=8 THEN 1475
		if ( G1 <= 8 )
			line1475();
		else
			line1448();
	}


	private void line1448(
	) {
		// 1448 IF G1<=10 THEN 1480
		if ( G1 <= 10 )
			line1480();
		else
			line1450();
	}


	private void line1450(
	) {
		// (original) 1450 V3=INT(A+V3)
		// (prferring the suggested bug fix) 1450 V3=ABS(INT(V1-V2))
		V3 = Math.abs( V1 - V2 );
		line1451();
	}


	private void line1451(
	) {
		// 1451 A=INT(A+V3)
		A += V3;
		line1452();
	}


	private void line1452(
	) {
		// 1452 GOTO 1500
		line1500();
	}


	private void line1460(
	) {
		// 1460 PRINT "FISH POPULATION HAS DWINDLED DUE TO WATER POLLUTION."
		System.out.println( "FISH POPULATION HAS DWINDLED DUE TO WATER POLLUTION." );
		line1462();
	}


	private void line1462(
	) {
		// 1462 GOTO 1450
		line1450();
	}


	private void line1465(
	) {
		// 1465 PRINT "AIR POLLUTION IS KILLING GAME BIRD POPULATION."
		System.out.println( "AIR POLLUTION IS KILLING GAME BIRD POPULATION." );
		line1467();
	}


	private void line1467(
	) {
		// 1467 GOTO 1450
		line1450();
	}


	private void line1470(
	) {
		// 1470 PRINT "MINERAL BATHS ARE BEING RUINED BY WATER POLLUTION."
		System.out.println( "MINERAL BATHS ARE BEING RUINED BY WATER POLLUTION." );
		line1472();
	}


	private void line1472(
	) {
		// 1472 GOTO 1450
		line1450();
	}


	private void line1475(
	) {
		// 1475 PRINT "UNPLEASANT SMOG IS DISCOURAGING SUN BATHERS."
		System.out.println( "UNPLEASANT SMOG IS DISCOURAGING SUN BATHERS." );
		line1477();
	}


	private void line1477(
	) {
		// 1477 GOTO 1450
		line1450();
	}


	private void line1480(
	) {
		// 1480 PRINT "HOTELS ARE LOOKING SHABBY DUE TO SMOG GRIT."
		System.out.println( "HOTELS ARE LOOKING SHABBY DUE TO SMOG GRIT." );
		line1482();
	}


	private void line1482(
	) {
		// 1482 GOTO 1450
		line1450();
	}


	private void line1500(
	) {
		// 1500 IF B5>200 THEN 1600
		if ( B5 > 200 )
			line1600();
		else
			line1505();
	}


	private void line1505(
	) {
		// 1505 IF B<343 THEN 1700
		if ( B < 343 )
			line1700();
		else
			line1510();
	}


	private void line1510(
	) {
		// 1510 IF (A4/100)>5 THEN 1800
		if ( A4 /100D > 5D )
			line1800();
		else
			line1515();
	}


	private void line1515(
	) {
		// 1515 IF C>B THEN 1550
		if ( C > B )
			line1550();
		else
			line1520();
	}


	private void line1520(
	) {
		// 1520 IF N5-1=X5 THEN 1900
		if ( N5 -1 == X5 )
			line1900();
		else
			line1545();
	}


	private void line1545(
	) {
		// 1545 GOTO 2000
		line2000();
	}


	private void line1550(
	) {
		// 1550 PRINT
		System.out.println();
		line1552();
	}


	private void line1552(
	) {
		// 1552 PRINT
		System.out.println();
		line1560();
	}


	private void line1560(
	) {
		// 1560 PRINT "THE NUMBER OF FOREIGN WORKERS HAS EXCEEDED THE NUMBER"
		System.out.println( "THE NUMBER OF FOREIGN WORKERS HAS EXCEEDED THE NUMBER" );
		line1562();
	}


	private void line1562(
	) {
		// 1562 PRINT "OF COUNTRYMEN. AS A MINORITY, THEY HAVE REVOLTED AND"
		System.out.println( "OF COUNTRYMEN. AS A MINORITY, THEY HAVE REVOLTED AND" );
		line1564();
	}


	private void line1564(
	) {
		// 1564 PRINT "TAKEN OVER THE COUNTRY."
		System.out.println( "TAKEN OVER THE COUNTRY." );
		line1570();
	}


	private void line1570(
	) {
		// 1570 IF RND(1)<=.5 THEN 1580
		if ( random.nextFloat() <= 0.5 )
			line1580();
		else
			line1574();
	}


	private void line1574(
	) {
		// 1574 PRINT "YOU HAVE BEEN THROWN OUT OF OFFICE AND ARE NOW"
		System.out.println( "YOU HAVE BEEN THROWN OUT OF OFFICE AND ARE NOW" );
		line1576();
	}


	private void line1576(
	) {
		// 1576 PRINT "RESIDING IN PRISON."
		System.out.println( "RESIDING IN PRISON." );
		line1578();
	}


	private void line1578(
	) {
		// 1578 GOTO 1590
		line1590();
	}


	private void line1580(
	) {
		// 1580 PRINT "YOU HAVE BEEN ASSASSINATED."
		System.out.println( "YOU HAVE BEEN ASSASSINATED." );
		line1590();
	}


	private void line1590(
	) {
		// 1590 PRINT
		System.out.println();
		line1592();
	}


	private void line1592(
	) {
		// 1592 PRINT
		System.out.println();
		line1596();
	}


	private void line1596(
	) {
		// 1596 STOP
		return;
	}


	private void line1600(
	) {
		// 1600 PRINT
		System.out.println();
		line1602();
	}


	private void line1602(
	) {
		// 1602 PRINT
		System.out.println();
		line1610();
	}


	private void line1610(
	) {
		// 1610 PRINT B5;"COUNTRYMEN DIED IN ONE YEAR!!!!!"
		System.out.println( B5 +" COUNTRYMEN DIED IN ONE YEAR!!!!!" );
		line1615();
	}


	private void line1615(
	) {
		// 1615 PRINT "DUE TO THIS EXTREME MISMANAGEMENT, YOU HAVE NOT ONLY"
		System.out.println( "DUE TO THIS EXTREME MISMANAGEMENT, YOU HAVE NOT ONLY" );
		line1620();
	}


	private void line1620(
	) {
		// 1620 PRINT "BEEN IMPEACHED AND THROWN OUT OF OFFICE, BUT YOU"
		System.out.println( "BEEN IMPEACHED AND THROWN OUT OF OFFICE, BUT YOU" );
		line1622();
	}


	private void line1622(
	) {
		// 1622 M6=INT(RND(1)*10)
		M6=(int)Math.round( random.nextFloat() *10 );
		line1625();
	}


	private void line1625(
	) {
		// 1625 IF M6<=3 THEN 1670
		if ( M6 <= 3 )
			line1670();
		else
			line1630();
	}


	private void line1630(
	) {
		// 1630 IF M6<=6 THEN 1680
		if ( M6 <= 6 )
			line1680();
		else
			line1635();
	}


	private void line1635(
	) {
		// 1635 IF M6<=10 THEN 1690
		if ( M6 <= 10 )
			line1690();
		else
			line1670();
	}


	private void line1670(
	) {
		// 1670 PRINT "ALSO HAD YOUR LEFT EYE GOUGED OUT!"
		System.out.println( "ALSO HAD YOUR LEFT EYE GOUGED OUT!" );
		line1672();
	}


	private void line1672(
	) {
		// 1672 GOTO 1590
		line1590();
	}


	private void line1680(
	) {
		// 1680 PRINT "HAVE ALSO GAINED A VERY BAD REPUTATION."
		System.out.println( "HAVE ALSO GAINED A VERY BAD REPUTATION." );
		line1682();
	}


	private void line1682(
	) {
		// 1682 GOTO 1590
		line1590();
	}


	private void line1690(
	) {
		// 1690 PRINT "HAVE ALSO BEEN DECLARED NATIONAL FINK."
		System.out.println( "HAVE ALSO BEEN DECLARED NATIONAL FINK." );
		line1692();
	}


	private void line1692(
	) {
		// 1692 GOTO 1590
		line1590();
	}


	private void line1700(
	) {
		// 1700 PRINT
		System.out.println();
		line1702();
	}


	private void line1702(
	) {
		// 1702 PRINT
		System.out.println();
		line1710();
	}


	private void line1710(
	) {
		// 1710 PRINT "OVER ONE THIRD OF THE POPULTATION HAS DIED SINCE YOU"
		System.out.println( "OVER ONE THIRD OF THE POPULTATION HAS DIED SINCE YOU" );
		line1715();
	}


	private void line1715(
	) {
		// 1715 PRINT "WERE ELECTED TO OFFICE. THE PEOPLE (REMAINING)"
		System.out.println( "WERE ELECTED TO OFFICE. THE PEOPLE (REMAINING)" );
		line1720();
	}


	private void line1720(
	) {
		// 1720 PRINT "HATE YOUR GUTS."
		System.out.println( "HATE YOUR GUTS." );
		line1730();
	}


	private void line1730(
	) {
		// 1730 GOTO 1570
		line1570();
	}


	private void line1800(
	) {
		// 1800 IF B5-F1<2 THEN 1515
		if ( B5 - F1 < 2 )
			line1515();
		else
			line1807();
	}


	private void line1807(
	) {
		// 1807 PRINT
		System.out.println();
		line1815();
	}


	private void line1815(
	) {
		// 1815 PRINT "MONEY WAS LEFT OVER IN THE TREASURY WHICH YOU DID"
		System.out.println( "MONEY WAS LEFT OVER IN THE TREASURY WHICH YOU DID" );
		line1820();
	}


	private void line1820(
	) {
		// 1820 PRINT "NOT SPEND. AS A RESULT, SOME OF YOUR COUNTRYMEN DIED"
		System.out.println( "NOT SPEND. AS A RESULT, SOME OF YOUR COUNTRYMEN DIED" );
		line1825();
	}


	private void line1825(
	) {
		// 1825 PRINT "OF STARVATION. THE PUBLIC IS ENRAGED AND YOU HAVE"
		System.out.println( "OF STARVATION. THE PUBLIC IS ENRAGED AND YOU HAVE" );
		line1830();
	}


	private void line1830(
	) {
		// 1830 PRINT "BEEN FORCED TO EITHER RESIGN OR COMMIT SUICIDE."
		System.out.println( "BEEN FORCED TO EITHER RESIGN OR COMMIT SUICIDE." );
		line1835();
	}


	private void line1835(
	) {
		// 1835 PRINT "THE CHOICE IS YOURS."
		System.out.println( "THE CHOICE IS YOURS." );
		line1840();
	}


	private void line1840(
	) {
		// 1840 PRINT "IF YOU CHOOSE THE LATTER, PLEASE TURN OFF YOUR COMPUTER"
		System.out.println( "IF YOU CHOOSE THE LATTER, PLEASE TURN OFF YOUR COMPUTER" );
		line1845();
	}


	private void line1845(
	) {
		// 1845 PRINT "BEFORE PROCEEDING."
		System.out.println( "BEFORE PROCEEDING." );
		line1850();
	}


	private void line1850(
	) {
		// 1850 GOTO 1590
		line1590();
	}


	private void line1900(
	) {
		// 1900 PRINT
		System.out.println();
		line1902();
	}


	private void line1902(
	) {
		// 1902 PRINT
		System.out.println();
		line1920();
	}


	private void line1920(
	) {
		// 1920 PRINT "CONGRATULATIONS!!!!!!!!!!!!!!!!!!"
		System.out.println( "CONGRATULATIONS!!!!!!!!!!!!!!!!!!" );
		line1925();
	}


	private void line1925(
	) {
		// 1925 PRINT "YOU HAVE SUCCESFULLY COMPLETED YOUR";N5;"YEAR TERM"
		System.out.println( "YOU HAVE SUCCESFULLY COMPLETED YOUR "+ N5 +" YEAR TERM" );
		line1930();
	}


	private void line1930(
	) {
		// 1930 PRINT "OF OFFICE. YOU WERE, OF COURSE, EXTREMELY LUCKY, BUT"
		System.out.println( "OF OFFICE. YOU WERE, OF COURSE, EXTREMELY LUCKY, BUT" );
		line1935();
	}


	private void line1935(
	) {
		// 1935 PRINT "NEVERTHELESS, IT'S QUITE AN ACHIEVEMENT. GOODBYE AND GOOD"
		System.out.println( "NEVERTHELESS, IT'S QUITE AN ACHIEVEMENT. GOODBYE AND GOOD" );
		line1940();
	}


	private void line1940(
	) {
		// 1940 PRINT "LUCK - YOU'LL PROBABLY NEED IT IF YOU'RE THE TYPE THAT"
		System.out.println( "LUCK - YOU'LL PROBABLY NEED IT IF YOU'RE THE TYPE THAT" );
		line1945();
	}


	private void line1945(
	) {
		// 1945 PRINT "PLAYS THIS GAME."
		System.out.println( "PLAYS THIS GAME." );
		line1950();
	}


	private void line1950(
	) {
		// 1950 GOTO 1590
		line1590();
	}


	private void line1960(
	) {
		// 1960 PRINT "HOW MANY YEARS HAD YOU BEEN IN OFFICE WHEN INTERRUPTED";
		System.out.println( "HOW MANY YEARS HAD YOU BEEN IN OFFICE, WHEN INTERRUPTED ?" );
		line1961();
	}


	private void line1961(
	) {
		// 1961 INPUT X5
		X5 = inputIntegerFromPlayer();
		line1962();
	}


	private void line1962(
	) {
		// 1962 IF X5<0 THEN 1590
		if ( X5 < 0 )
			line1590();
		else
			line1963();
	}


	private void line1963(
	) {
		// 1963 IF X5<8 THEN 1969
		if ( X5 < 8 )
			line1969();
		else
			line1965();
	}


	private void line1965(
	) {
		// 1965 PRINT "   COME ON, YOUR TERM IN OFFICE IS ONLY";N5;"YEARS."
		System.out.println( "   COME ON, YOUR TERM IN OFFICE IS ONLY "+ N5 +" YEARS." );
		line1967();
	}


	private void line1967(
	) {
		// 1967 GOTO 1960
		line1960();
	}


	private void line1969(
	) {
		// 1969 PRINT "HOW MUCH DID YOU HAVE IN THE TREASURY";
		System.out.println( "HOW MUCH DID YOU HAVE IN THE TREASURY ?" );
		line1970();
	}


	private void line1970(
	) {
		// 1970 INPUT A
		A = inputIntegerFromPlayer();
		line1971();
	}


	private void line1971(
	) {
		// 1971 IF A<0 THEN 1590
		if ( A < 0 )
			line1590();
		else
			line1975();
	}


	private void line1975(
	) {
		// 1975 PRINT "HOW MANY COUNTRYMEN";
		System.out.println( "HOW MANY COUNTRYMEN ?" );
		line1976();
	}


	private void line1976(
	) {
		// 1976 INPUT B
		B = inputIntegerFromPlayer();
		line1977();
	}


	private void line1977(
	) {
		// 1977 IF B<0 THEN 1590
		if ( B < 0 )
			line1590();
		else
			line1980();
	}


	private void line1980(
	) {
		// 1980 PRINT "HOW MANY WORKERS";
		System.out.println( "HOW MANY WORKERS ?" );
		line1981();
	}


	private void line1981(
	) {
		// 1981 INPUT C
		C = inputIntegerFromPlayer();
		line1982();
	}


	private void line1982(
	) {
		// 1982 IF C<0 THEN 1590
		if ( C < 0 )
			line1590();
		else
			line1990();
	}


	private void line1990(
	) {
		// 1990 PRINT "HOW MANY SQUARE MILES OF LAND";
		System.out.println( "HOW MANY SQUARE MILES OF LAND ?" );
		line1991();
	}


	private void line1991(
	) {
		// 1991 INPUT D
		D = inputIntegerFromPlayer();
		line1992();
	}


	private void line1992(
	) {
		// 1992 IF D<0 THEN 1590
		if ( D < 0 )
			line1590();
		else
			line1993();
	}


	private void line1993(
	) {
		// 1993 IF D>2000 THEN 1996
		if ( D > 2_000 )
			line1996();
		else
			line1994();
	}


	private void line1994(
	) {
		// 1994 IF D>1000 THEN 100
		if ( D > 2_000 )
			line100();
		else
			line1996();
	}


	private void line1996(
	) {
		// 1996 PRINT "   COME ON, YOU STARTED WITH 1000 SQ. MILES OF FARM LAND"
		System.out.println( "   COME ON, YOU STARTED WITH 1000 SQ. MILES OF FARM LAND" );
		line1997();
	}


	private void line1997(
	) {
		// 1997 PRINT "   AND 1,000 SQ. MILES OF FOREST LAND."
		System.out.println( "   AND 1,000 SQ. MILES OF FOREST LAND." );
		line1998();
	}


	private void line1998(
	) {
		// 1998 GOTO 1990
		line1990();
	}


	private void line2000(
	) {
		// 2000 X5=X5+1
		X5 += 1;
		line2020();
	}


	private void line2020(
	) {
		// 2020 B5=0
		B5 = 0;
		line2040();
	}


	private void line2040(
	) {
		// 2040 GOTO 100
		line100();
	}


	private void line2046(
	) {
		// 2046 END
		System.exit( 1 );
	}


	private int inputIntegerFromPlayer(
	) {
		int value = 0;
		while ( true ) {
			try {
				value = input.nextInt();
				break;
			}
			catch ( InputMismatchException ime ) {
				System.err.println( "\tintegers only\n -- " );
			}
		}
		return value;
	}


}


