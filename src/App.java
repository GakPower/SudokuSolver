import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class App {

	@FXML private JFXButton solveButton;
	@FXML private JFXTextField textField00;
	@FXML private JFXTextField textField10;
	@FXML private JFXTextField textField20;
	@FXML private JFXTextField textField30;
	@FXML private JFXTextField textField40;
	@FXML private JFXTextField textField50;
	@FXML private JFXTextField textField60;
	@FXML private JFXTextField textField70;
	@FXML private JFXTextField textField80;

	@FXML private JFXTextField textField01;
	@FXML private JFXTextField textField11;
	@FXML private JFXTextField textField21;
	@FXML private JFXTextField textField31;
	@FXML private JFXTextField textField41;
	@FXML private JFXTextField textField51;
	@FXML private JFXTextField textField61;
	@FXML private JFXTextField textField71;
	@FXML private JFXTextField textField81;

	@FXML private JFXTextField textField02;
	@FXML private JFXTextField textField12;
	@FXML private JFXTextField textField22;
	@FXML private JFXTextField textField32;
	@FXML private JFXTextField textField42;
	@FXML private JFXTextField textField52;
	@FXML private JFXTextField textField62;
	@FXML private JFXTextField textField72;
	@FXML private JFXTextField textField82;

	@FXML private JFXTextField textField03;
	@FXML private JFXTextField textField13;
	@FXML private JFXTextField textField23;
	@FXML private JFXTextField textField33;
	@FXML private JFXTextField textField43;
	@FXML private JFXTextField textField53;
	@FXML private JFXTextField textField63;
	@FXML private JFXTextField textField73;
	@FXML private JFXTextField textField83;

	@FXML private JFXTextField textField04;
	@FXML private JFXTextField textField14;
	@FXML private JFXTextField textField24;
	@FXML private JFXTextField textField34;
	@FXML private JFXTextField textField44;
	@FXML private JFXTextField textField54;
	@FXML private JFXTextField textField64;
	@FXML private JFXTextField textField74;
	@FXML private JFXTextField textField84;

	@FXML private JFXTextField textField05;
	@FXML private JFXTextField textField15;
	@FXML private JFXTextField textField25;
	@FXML private JFXTextField textField35;
	@FXML private JFXTextField textField45;
	@FXML private JFXTextField textField55;
	@FXML private JFXTextField textField65;
	@FXML private JFXTextField textField75;
	@FXML private JFXTextField textField85;

	@FXML private JFXTextField textField06;
	@FXML private JFXTextField textField16;
	@FXML private JFXTextField textField26;
	@FXML private JFXTextField textField36;
	@FXML private JFXTextField textField46;
	@FXML private JFXTextField textField56;
	@FXML private JFXTextField textField66;
	@FXML private JFXTextField textField76;
	@FXML private JFXTextField textField86;

	@FXML private JFXTextField textField07;
	@FXML private JFXTextField textField17;
	@FXML private JFXTextField textField27;
	@FXML private JFXTextField textField37;
	@FXML private JFXTextField textField47;
	@FXML private JFXTextField textField57;
	@FXML private JFXTextField textField67;
	@FXML private JFXTextField textField77;
	@FXML private JFXTextField textField87;

	@FXML private JFXTextField textField08;
	@FXML private JFXTextField textField18;
	@FXML private JFXTextField textField28;
	@FXML private JFXTextField textField38;
	@FXML private JFXTextField textField48;
	@FXML private JFXTextField textField58;
	@FXML private JFXTextField textField68;
	@FXML private JFXTextField textField78;
	@FXML private JFXTextField textField88;

	@FXML private void initialize(){
		Field field00 = new Field(textField00);//, sudokuBox1, sudokuRow1, sudokuColumn1);
		Field field10 = new Field(textField10);//, sudokuBox1, sudokuRow1, sudokuColumn2);
		Field field20 = new Field(textField20);//, sudokuBox1, sudokuRow1, sudokuColumn3);
		Field field30 = new Field(textField30);//, sudokuBox2, sudokuRow1, sudokuColumn4);
		Field field40 = new Field(textField40);//, sudokuBox2, sudokuRow1, sudokuColumn5);
		Field field50 = new Field(textField50);//, sudokuBox2, sudokuRow1, sudokuColumn6);
		Field field60 = new Field(textField60);//, sudokuBox3, sudokuRow1, sudokuColumn7);
		Field field70 = new Field(textField70);//, sudokuBox3, sudokuRow1, sudokuColumn8);
		Field field80 = new Field(textField80);//, sudokuBox3, sudokuRow1, sudokuColumn9);

		Field field01 = new Field(textField01);//, sudokuBox1, sudokuRow2, sudokuColumn1);
		Field field11 = new Field(textField11);//, sudokuBox1, sudokuRow2, sudokuColumn2);
		Field field21 = new Field(textField21);//, sudokuBox1, sudokuRow2, sudokuColumn3);
		Field field31 = new Field(textField31);//, sudokuBox2, sudokuRow2, sudokuColumn4);
		Field field41 = new Field(textField41);//, sudokuBox2, sudokuRow2, sudokuColumn5);
		Field field51 = new Field(textField51);//, sudokuBox2, sudokuRow2, sudokuColumn6);
		Field field61 = new Field(textField61);//, sudokuBox3, sudokuRow2, sudokuColumn7);
		Field field71 = new Field(textField71);//, sudokuBox3, sudokuRow2, sudokuColumn8);
		Field field81 = new Field(textField81);//, sudokuBox3, sudokuRow2, sudokuColumn9);

		Field field02 = new Field(textField02);//, sudokuBox1, sudokuRow3, sudokuColumn1);
		Field field12 = new Field(textField12);//, sudokuBox1, sudokuRow3, sudokuColumn2);
		Field field22 = new Field(textField22);//, sudokuBox1, sudokuRow3, sudokuColumn3);
		Field field32 = new Field(textField32);//, sudokuBox2, sudokuRow3, sudokuColumn4);
		Field field42 = new Field(textField42);//, sudokuBox2, sudokuRow3, sudokuColumn5);
		Field field52 = new Field(textField52);//, sudokuBox2, sudokuRow3, sudokuColumn6);
		Field field62 = new Field(textField62);//, sudokuBox3, sudokuRow3, sudokuColumn7);
		Field field72 = new Field(textField72);//, sudokuBox3, sudokuRow3, sudokuColumn8);
		Field field82 = new Field(textField82);//, sudokuBox3, sudokuRow3, sudokuColumn9);

		Field field03 = new Field(textField03);//, sudokuBox4, sudokuRow4, sudokuColumn1);
		Field field13 = new Field(textField13);//, sudokuBox4, sudokuRow4, sudokuColumn2);
		Field field23 = new Field(textField23);//, sudokuBox4, sudokuRow4, sudokuColumn3);
		Field field33 = new Field(textField33);//, sudokuBox5, sudokuRow4, sudokuColumn4);
		Field field43 = new Field(textField43);//, sudokuBox5, sudokuRow4, sudokuColumn5);
		Field field53 = new Field(textField53);//, sudokuBox5, sudokuRow4, sudokuColumn6);
		Field field63 = new Field(textField63);//, sudokuBox6, sudokuRow4, sudokuColumn7);
		Field field73 = new Field(textField73);//, sudokuBox6, sudokuRow4, sudokuColumn8);
		Field field83 = new Field(textField83);//, sudokuBox6, sudokuRow4, sudokuColumn9);

		Field field04 = new Field(textField04);//, sudokuBox4, sudokuRow5, sudokuColumn1);
		Field field14 = new Field(textField14);//, sudokuBox4, sudokuRow5, sudokuColumn2);
		Field field24 = new Field(textField24);//, sudokuBox4, sudokuRow5, sudokuColumn3);
		Field field34 = new Field(textField34);//, sudokuBox5, sudokuRow5, sudokuColumn4);
		Field field44 = new Field(textField44);//, sudokuBox5, sudokuRow5, sudokuColumn5);
		Field field54 = new Field(textField54);//, sudokuBox5, sudokuRow5, sudokuColumn6);
		Field field64 = new Field(textField64);//, sudokuBox6, sudokuRow5, sudokuColumn7);
		Field field74 = new Field(textField74);//, sudokuBox6, sudokuRow5, sudokuColumn8);
		Field field84 = new Field(textField84);//, sudokuBox6, sudokuRow5, sudokuColumn9);

		Field field05 = new Field(textField05);//, sudokuBox4, sudokuRow6, sudokuColumn1);
		Field field15 = new Field(textField15);//, sudokuBox4, sudokuRow6, sudokuColumn2);
		Field field25 = new Field(textField25);//, sudokuBox4, sudokuRow6, sudokuColumn3);
		Field field35 = new Field(textField35);//, sudokuBox5, sudokuRow6, sudokuColumn4);
		Field field45 = new Field(textField45);//, sudokuBox5, sudokuRow6, sudokuColumn5);
		Field field55 = new Field(textField55);//, sudokuBox5, sudokuRow6, sudokuColumn6);
		Field field65 = new Field(textField65);//, sudokuBox6, sudokuRow6, sudokuColumn7);
		Field field75 = new Field(textField75);//, sudokuBox6, sudokuRow6, sudokuColumn8);
		Field field85 = new Field(textField85);//, sudokuBox6, sudokuRow6, sudokuColumn9);

		Field field06 = new Field(textField06);//, sudokuBox7, sudokuRow7, sudokuColumn1);
		Field field16 = new Field(textField16);//, sudokuBox7, sudokuRow7, sudokuColumn2);
		Field field26 = new Field(textField26);//, sudokuBox7, sudokuRow7, sudokuColumn3);
		Field field36 = new Field(textField36);//, sudokuBox8, sudokuRow7, sudokuColumn4);
		Field field46 = new Field(textField46);//, sudokuBox8, sudokuRow7, sudokuColumn5);
		Field field56 = new Field(textField56);//, sudokuBox8, sudokuRow7, sudokuColumn6);
		Field field66 = new Field(textField66);//, sudokuBox9, sudokuRow7, sudokuColumn7);
		Field field76 = new Field(textField76);//, sudokuBox9, sudokuRow7, sudokuColumn8);
		Field field86 = new Field(textField86);//, sudokuBox9, sudokuRow7, sudokuColumn9);

		Field field07 = new Field(textField07);//, sudokuBox7, sudokuRow8, sudokuColumn1);
		Field field17 = new Field(textField17);//, sudokuBox7, sudokuRow8, sudokuColumn2);
		Field field27 = new Field(textField27);//, sudokuBox7, sudokuRow8, sudokuColumn3);
		Field field37 = new Field(textField37);//, sudokuBox8, sudokuRow8, sudokuColumn4);
		Field field47 = new Field(textField47);//, sudokuBox8, sudokuRow8, sudokuColumn5);
		Field field57 = new Field(textField57);//, sudokuBox8, sudokuRow8, sudokuColumn6);
		Field field67 = new Field(textField67);//, sudokuBox9, sudokuRow8, sudokuColumn7);
		Field field77 = new Field(textField77);//, sudokuBox9, sudokuRow8, sudokuColumn8);
		Field field87 = new Field(textField87);//, sudokuBox9, sudokuRow8, sudokuColumn9);

		Field field08 = new Field(textField08);//, sudokuBox7, sudokuRow9, sudokuColumn1);
		Field field18 = new Field(textField18);//, sudokuBox7, sudokuRow9, sudokuColumn2);
		Field field28 = new Field(textField28);//, sudokuBox7, sudokuRow9, sudokuColumn3);
		Field field38 = new Field(textField38);//, sudokuBox8, sudokuRow9, sudokuColumn4);
		Field field48 = new Field(textField48);//, sudokuBox8, sudokuRow9, sudokuColumn5);
		Field field58 = new Field(textField58);//, sudokuBox8, sudokuRow9, sudokuColumn6);
		Field field68 = new Field(textField68);//, sudokuBox9, sudokuRow9, sudokuColumn7);
		Field field78 = new Field(textField78);//, sudokuBox9, sudokuRow9, sudokuColumn8);
		Field field88 = new Field(textField88);//, sudokuBox9, sudokuRow9, sudokuColumn9);

		ArrayList<Field> fields = new ArrayList<>();

		fields.add(field00);
		fields.add(field10);
		fields.add(field20);
		fields.add(field01);
		fields.add(field11);
		fields.add(field21);
		fields.add(field02);
		fields.add(field12);
		fields.add(field22);
		SudokuArea sudokuBox1 = new SudokuArea(fields);

		fields.clear();
		fields.add(field00);
		fields.add(field10);
		fields.add(field20);
		fields.add(field30);
		fields.add(field40);
		fields.add(field50);
		fields.add(field60);
		fields.add(field70);
		fields.add(field80);
		SudokuArea sudokuRow1 = new SudokuArea(fields);

		fields.clear();
		fields.add(field00);
		fields.add(field01);
		fields.add(field02);
		fields.add(field03);
		fields.add(field04);
		fields.add(field05);
		fields.add(field06);
		fields.add(field07);
		fields.add(field08);
		SudokuArea sudokuColumn1 = new SudokuArea(fields);

		//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
		fields.clear();
		fields.add(field30);
		fields.add(field40);
		fields.add(field50);
		fields.add(field31);
		fields.add(field41);
		fields.add(field51);
		fields.add(field32);
		fields.add(field42);
		fields.add(field52);
		SudokuArea sudokuBox2 = new SudokuArea(fields);

		fields.clear();
		fields.add(field01);
		fields.add(field11);
		fields.add(field21);
		fields.add(field31);
		fields.add(field41);
		fields.add(field51);
		fields.add(field61);
		fields.add(field71);
		fields.add(field81);
		SudokuArea sudokuRow2 = new SudokuArea(fields);

		fields.clear();
		fields.add(field10);
		fields.add(field11);
		fields.add(field12);
		fields.add(field13);
		fields.add(field14);
		fields.add(field15);
		fields.add(field16);
		fields.add(field17);
		fields.add(field18);
		SudokuArea sudokuColumn2 = new SudokuArea(fields);

		//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
		fields.clear();
		fields.add(field60);
		fields.add(field70);
		fields.add(field80);
		fields.add(field61);
		fields.add(field71);
		fields.add(field81);
		fields.add(field62);
		fields.add(field72);
		fields.add(field82);
		SudokuArea sudokuBox3 = new SudokuArea(fields);

		fields.clear();
		fields.add(field02);
		fields.add(field12);
		fields.add(field22);
		fields.add(field32);
		fields.add(field42);
		fields.add(field52);
		fields.add(field62);
		fields.add(field72);
		fields.add(field82);
		SudokuArea sudokuRow3 = new SudokuArea(fields);

		fields.clear();
		fields.add(field20);
		fields.add(field21);
		fields.add(field22);
		fields.add(field23);
		fields.add(field24);
		fields.add(field25);
		fields.add(field26);
		fields.add(field27);
		fields.add(field28);
		SudokuArea sudokuColumn3 = new SudokuArea(fields);

		//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
		fields.clear();
		fields.add(field03);
		fields.add(field13);
		fields.add(field23);
		fields.add(field04);
		fields.add(field14);
		fields.add(field24);
		fields.add(field05);
		fields.add(field15);
		fields.add(field25);
		SudokuArea sudokuBox4 = new SudokuArea(fields);

		fields.clear();
		fields.add(field03);
		fields.add(field13);
		fields.add(field23);
		fields.add(field33);
		fields.add(field43);
		fields.add(field53);
		fields.add(field63);
		fields.add(field73);
		fields.add(field83);
		SudokuArea sudokuRow4 = new SudokuArea(fields);

		fields.clear();
		fields.add(field30);
		fields.add(field31);
		fields.add(field32);
		fields.add(field33);
		fields.add(field34);
		fields.add(field35);
		fields.add(field36);
		fields.add(field37);
		fields.add(field38);
		SudokuArea sudokuColumn4 = new SudokuArea(fields);
		//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
		fields.clear();
		fields.add(field33);
		fields.add(field43);
		fields.add(field53);
		fields.add(field34);
		fields.add(field44);
		fields.add(field54);
		fields.add(field35);
		fields.add(field45);
		fields.add(field55);
		SudokuArea sudokuBox5 = new SudokuArea(fields);

		fields.clear();
		fields.add(field04);
		fields.add(field14);
		fields.add(field24);
		fields.add(field34);
		fields.add(field44);
		fields.add(field54);
		fields.add(field64);
		fields.add(field74);
		fields.add(field84);
		SudokuArea sudokuRow5 = new SudokuArea(fields);

		fields.clear();
		fields.add(field40);
		fields.add(field41);
		fields.add(field42);
		fields.add(field43);
		fields.add(field44);
		fields.add(field45);
		fields.add(field46);
		fields.add(field47);
		fields.add(field48);
		SudokuArea sudokuColumn5 = new SudokuArea(fields);
		//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
		fields.clear();
		fields.add(field63);
		fields.add(field73);
		fields.add(field83);
		fields.add(field64);
		fields.add(field74);
		fields.add(field84);
		fields.add(field65);
		fields.add(field75);
		fields.add(field85);
		SudokuArea sudokuBox6 = new SudokuArea(fields);

		fields.clear();
		fields.add(field05);
		fields.add(field15);
		fields.add(field25);
		fields.add(field35);
		fields.add(field45);
		fields.add(field55);
		fields.add(field65);
		fields.add(field75);
		fields.add(field85);
		SudokuArea sudokuRow6 = new SudokuArea(fields);

		fields.clear();
		fields.add(field50);
		fields.add(field51);
		fields.add(field52);
		fields.add(field53);
		fields.add(field54);
		fields.add(field55);
		fields.add(field56);
		fields.add(field57);
		fields.add(field58);
		SudokuArea sudokuColumn6 = new SudokuArea(fields);
		//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
		fields.clear();
		fields.add(field06);
		fields.add(field16);
		fields.add(field26);
		fields.add(field07);
		fields.add(field17);
		fields.add(field27);
		fields.add(field08);
		fields.add(field18);
		fields.add(field28);
		SudokuArea sudokuBox7 = new SudokuArea(fields);

		fields.clear();
		fields.add(field06);
		fields.add(field16);
		fields.add(field26);
		fields.add(field36);
		fields.add(field46);
		fields.add(field56);
		fields.add(field66);
		fields.add(field76);
		fields.add(field86);
		SudokuArea sudokuRow7 = new SudokuArea(fields);

		fields.clear();
		fields.add(field60);
		fields.add(field61);
		fields.add(field62);
		fields.add(field63);
		fields.add(field64);
		fields.add(field65);
		fields.add(field66);
		fields.add(field67);
		fields.add(field68);
		SudokuArea sudokuColumn7 = new SudokuArea(fields);
		//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
		fields.clear();
		fields.add(field36);
		fields.add(field46);
		fields.add(field56);
		fields.add(field37);
		fields.add(field47);
		fields.add(field57);
		fields.add(field38);
		fields.add(field48);
		fields.add(field58);
		SudokuArea sudokuBox8 = new SudokuArea(fields);

		fields.clear();
		fields.add(field07);
		fields.add(field17);
		fields.add(field27);
		fields.add(field37);
		fields.add(field47);
		fields.add(field57);
		fields.add(field67);
		fields.add(field77);
		fields.add(field87);
		SudokuArea sudokuRow8 = new SudokuArea(fields);

		fields.clear();
		fields.add(field70);
		fields.add(field71);
		fields.add(field72);
		fields.add(field73);
		fields.add(field74);
		fields.add(field75);
		fields.add(field76);
		fields.add(field77);
		fields.add(field78);
		SudokuArea sudokuColumn8 = new SudokuArea(fields);
		//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
		fields.clear();
		fields.add(field66);
		fields.add(field76);
		fields.add(field86);
		fields.add(field67);
		fields.add(field77);
		fields.add(field87);
		fields.add(field68);
		fields.add(field78);
		fields.add(field88);
		SudokuArea sudokuBox9 = new SudokuArea(fields);

		fields.clear();
		fields.add(field08);
		fields.add(field18);
		fields.add(field28);
		fields.add(field38);
		fields.add(field48);
		fields.add(field58);
		fields.add(field68);
		fields.add(field78);
		fields.add(field88);
		SudokuArea sudokuRow9 = new SudokuArea(fields);

		fields.clear();
		fields.add(field80);
		fields.add(field81);
		fields.add(field82);
		fields.add(field83);
		fields.add(field84);
		fields.add(field85);
		fields.add(field86);
		fields.add(field87);
		fields.add(field88);
		SudokuArea sudokuColumn9 = new SudokuArea(fields);
		//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

		field00.addAreas(new GroupArea(sudokuBox1, sudokuRow1, sudokuColumn1));
		field10.addAreas(new GroupArea(sudokuBox1, sudokuRow1, sudokuColumn2));
		field20.addAreas(new GroupArea(sudokuBox1, sudokuRow1, sudokuColumn3));
		field30.addAreas(new GroupArea(sudokuBox2, sudokuRow1, sudokuColumn4));
		field40.addAreas(new GroupArea(sudokuBox2, sudokuRow1, sudokuColumn5));
		field50.addAreas(new GroupArea(sudokuBox2, sudokuRow1, sudokuColumn6));
		field60.addAreas(new GroupArea(sudokuBox3, sudokuRow1, sudokuColumn7));
		field70.addAreas(new GroupArea(sudokuBox3, sudokuRow1, sudokuColumn8));
		field80.addAreas(new GroupArea(sudokuBox3, sudokuRow1, sudokuColumn9));
		field01.addAreas(new GroupArea(sudokuBox1, sudokuRow2, sudokuColumn1));
		field11.addAreas(new GroupArea(sudokuBox1, sudokuRow2, sudokuColumn2));
		field21.addAreas(new GroupArea(sudokuBox1, sudokuRow2, sudokuColumn3));
		field31.addAreas(new GroupArea(sudokuBox2, sudokuRow2, sudokuColumn4));
		field41.addAreas(new GroupArea(sudokuBox2, sudokuRow2, sudokuColumn5));
		field51.addAreas(new GroupArea(sudokuBox2, sudokuRow2, sudokuColumn6));
		field61.addAreas(new GroupArea(sudokuBox3, sudokuRow2, sudokuColumn7));
		field71.addAreas(new GroupArea(sudokuBox3, sudokuRow2, sudokuColumn8));
		field81.addAreas(new GroupArea(sudokuBox3, sudokuRow2, sudokuColumn9));
		field02.addAreas(new GroupArea(sudokuBox1, sudokuRow3, sudokuColumn1));
		field12.addAreas(new GroupArea(sudokuBox1, sudokuRow3, sudokuColumn2));
		field22.addAreas(new GroupArea(sudokuBox1, sudokuRow3, sudokuColumn3));
		field32.addAreas(new GroupArea(sudokuBox2, sudokuRow3, sudokuColumn4));
		field42.addAreas(new GroupArea(sudokuBox2, sudokuRow3, sudokuColumn5));
		field52.addAreas(new GroupArea(sudokuBox2, sudokuRow3, sudokuColumn6));
		field62.addAreas(new GroupArea(sudokuBox3, sudokuRow3, sudokuColumn7));
		field72.addAreas(new GroupArea(sudokuBox3, sudokuRow3, sudokuColumn8));
		field82.addAreas(new GroupArea(sudokuBox3, sudokuRow3, sudokuColumn9));
		field03.addAreas(new GroupArea(sudokuBox4, sudokuRow4, sudokuColumn1));
		field13.addAreas(new GroupArea(sudokuBox4, sudokuRow4, sudokuColumn2));
		field23.addAreas(new GroupArea(sudokuBox4, sudokuRow4, sudokuColumn3));
		field33.addAreas(new GroupArea(sudokuBox5, sudokuRow4, sudokuColumn4));
		field43.addAreas(new GroupArea(sudokuBox5, sudokuRow4, sudokuColumn5));
		field53.addAreas(new GroupArea(sudokuBox5, sudokuRow4, sudokuColumn6));
		field63.addAreas(new GroupArea(sudokuBox6, sudokuRow4, sudokuColumn7));
		field73.addAreas(new GroupArea(sudokuBox6, sudokuRow4, sudokuColumn8));
		field83.addAreas(new GroupArea(sudokuBox6, sudokuRow4, sudokuColumn9));
		field04.addAreas(new GroupArea(sudokuBox4, sudokuRow5, sudokuColumn1));
		field14.addAreas(new GroupArea(sudokuBox4, sudokuRow5, sudokuColumn2));
		field24.addAreas(new GroupArea(sudokuBox4, sudokuRow5, sudokuColumn3));
		field34.addAreas(new GroupArea(sudokuBox5, sudokuRow5, sudokuColumn4));
		field44.addAreas(new GroupArea(sudokuBox5, sudokuRow5, sudokuColumn5));
		field54.addAreas(new GroupArea(sudokuBox5, sudokuRow5, sudokuColumn6));
		field64.addAreas(new GroupArea(sudokuBox6, sudokuRow5, sudokuColumn7));
		field74.addAreas(new GroupArea(sudokuBox6, sudokuRow5, sudokuColumn8));
		field84.addAreas(new GroupArea(sudokuBox6, sudokuRow5, sudokuColumn9));
		field05.addAreas(new GroupArea(sudokuBox4, sudokuRow6, sudokuColumn1));
		field15.addAreas(new GroupArea(sudokuBox4, sudokuRow6, sudokuColumn2));
		field25.addAreas(new GroupArea(sudokuBox4, sudokuRow6, sudokuColumn3));
		field35.addAreas(new GroupArea(sudokuBox5, sudokuRow6, sudokuColumn4));
		field45.addAreas(new GroupArea(sudokuBox5, sudokuRow6, sudokuColumn5));
		field55.addAreas(new GroupArea(sudokuBox5, sudokuRow6, sudokuColumn6));
		field65.addAreas(new GroupArea(sudokuBox6, sudokuRow6, sudokuColumn7));
		field75.addAreas(new GroupArea(sudokuBox6, sudokuRow6, sudokuColumn8));
		field85.addAreas(new GroupArea(sudokuBox6, sudokuRow6, sudokuColumn9));
		field06.addAreas(new GroupArea(sudokuBox7, sudokuRow7, sudokuColumn1));
		field16.addAreas(new GroupArea(sudokuBox7, sudokuRow7, sudokuColumn2));
		field26.addAreas(new GroupArea(sudokuBox7, sudokuRow7, sudokuColumn3));
		field36.addAreas(new GroupArea(sudokuBox8, sudokuRow7, sudokuColumn4));
		field46.addAreas(new GroupArea(sudokuBox8, sudokuRow7, sudokuColumn5));
		field56.addAreas(new GroupArea(sudokuBox8, sudokuRow7, sudokuColumn6));
		field66.addAreas(new GroupArea(sudokuBox9, sudokuRow7, sudokuColumn7));
		field76.addAreas(new GroupArea(sudokuBox9, sudokuRow7, sudokuColumn8));
		field86.addAreas(new GroupArea(sudokuBox9, sudokuRow7, sudokuColumn9));
		field07.addAreas(new GroupArea(sudokuBox7, sudokuRow8, sudokuColumn1));
		field17.addAreas(new GroupArea(sudokuBox7, sudokuRow8, sudokuColumn2));
		field27.addAreas(new GroupArea(sudokuBox7, sudokuRow8, sudokuColumn3));
		field37.addAreas(new GroupArea(sudokuBox8, sudokuRow8, sudokuColumn4));
		field47.addAreas(new GroupArea(sudokuBox8, sudokuRow8, sudokuColumn5));
		field57.addAreas(new GroupArea(sudokuBox8, sudokuRow8, sudokuColumn6));
		field67.addAreas(new GroupArea(sudokuBox9, sudokuRow8, sudokuColumn7));
		field77.addAreas(new GroupArea(sudokuBox9, sudokuRow8, sudokuColumn8));
		field87.addAreas(new GroupArea(sudokuBox9, sudokuRow8, sudokuColumn9));
		field08.addAreas(new GroupArea(sudokuBox7, sudokuRow9, sudokuColumn1));
		field18.addAreas(new GroupArea(sudokuBox7, sudokuRow9, sudokuColumn2));
		field28.addAreas(new GroupArea(sudokuBox7, sudokuRow9, sudokuColumn3));
		field38.addAreas(new GroupArea(sudokuBox8, sudokuRow9, sudokuColumn4));
		field48.addAreas(new GroupArea(sudokuBox8, sudokuRow9, sudokuColumn5));
		field58.addAreas(new GroupArea(sudokuBox8, sudokuRow9, sudokuColumn6));
		field68.addAreas(new GroupArea(sudokuBox9, sudokuRow9, sudokuColumn7));
		field78.addAreas(new GroupArea(sudokuBox9, sudokuRow9, sudokuColumn8));
		field88.addAreas(new GroupArea(sudokuBox9, sudokuRow9, sudokuColumn9));

		ArrayList<SudokuArea> sudokuBoxes = new ArrayList<>();
		sudokuBoxes.add(sudokuBox1);
		sudokuBoxes.add(sudokuBox2);
		sudokuBoxes.add(sudokuBox3);
		sudokuBoxes.add(sudokuBox4);
		sudokuBoxes.add(sudokuBox5);
		sudokuBoxes.add(sudokuBox6);
		sudokuBoxes.add(sudokuBox7);
		sudokuBoxes.add(sudokuBox8);
		sudokuBoxes.add(sudokuBox9);

		ArrayList<SudokuArea> sudokuRows = new ArrayList<>();
		sudokuRows.add(sudokuRow1);
		sudokuRows.add(sudokuRow2);
		sudokuRows.add(sudokuRow3);
		sudokuRows.add(sudokuRow4);
		sudokuRows.add(sudokuRow5);
		sudokuRows.add(sudokuRow6);
		sudokuRows.add(sudokuRow7);
		sudokuRows.add(sudokuRow8);
		sudokuRows.add(sudokuRow9);

		ArrayList<SudokuArea> sudokuColumns = new ArrayList<>();
		sudokuColumns.add(sudokuColumn1);
		sudokuColumns.add(sudokuColumn2);
		sudokuColumns.add(sudokuColumn3);
		sudokuColumns.add(sudokuColumn4);
		sudokuColumns.add(sudokuColumn5);
		sudokuColumns.add(sudokuColumn6);
		sudokuColumns.add(sudokuColumn7);
		sudokuColumns.add(sudokuColumn8);
		sudokuColumns.add(sudokuColumn9);

		SudokuBoard sudokuBoard = new SudokuBoard(sudokuBoxes, sudokuRows, sudokuColumns);

		solveButton.setOnAction((event -> {
			sudokuBoard.getFields().forEach(field -> {
				if (field.getNumber() != 0){
					field.setAsInitialField();
					field.getField().setStyle("-fx-background-color: #d9d4d8");
					field.getField().setEditable(false);
					field.getField().setDisable(false);
				}
			});
			//Field.solveNakedSingles(sudokuBoard);
			Field.solveHiddenSingles(sudokuBoard);doulevei entelos lathos
		}));
	}
}
