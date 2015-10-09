package LexicalAnalyzer;

import java.util.LinkedList;

/**
 * Created by kodoo on 09.10.2015.
 */
public class Analyzer {

    LinkedList<Token>     tokens;

    // ��������� ������� � ������� �������������
    // ��� ������� ������� ��� ID0, 1�� ������� ������ - ID1 � �.�.
    LinkedList<String> idTable;
    // �� �� ����� � Int ����������� CI
    LinkedList<Integer>   constantTable;
    // �� �� ����� � ��������� ������ MARK
    LinkedList<Integer>   markTable;

    public LinkedList<Token> getTokens() {
        return tokens;
    }

    public LinkedList<String> getIdTable() {
        return idTable;
    }

    public LinkedList<Integer> getConstantTable() {
        return constantTable;
    }

    public LinkedList<Integer> getMarkTable() {
        return markTable;
    }

    /**
     * ��� ������ �������� �� ����� ��������������� �����������
     * @param source - �������� ���
     */
    public Analyzer(String source) {

        tokens          = new LinkedList<>();
        idTable         = new LinkedList<>();
        constantTable   = new LinkedList<>();
        markTable       = new LinkedList<>();

        //������ �������� �����
        Token t = new Token(Token.Type.ID);
        //�������� � ������ �������
        tokens.push(t);
        //�.�. ��� ��� ID, �� �������� ��� �������� � ������� ID
        idTable.push("��������");
        // ������� ������ ������ � ���������� ��� �������� � �������
        t.setIndex(idTable.indexOf(t));

        //TODO: ������ �����������, ������������ ������ � ��������� �������
    }

}
