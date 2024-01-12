package core;

public class propriedades {

    public static boolean FECHAR_BROWSER = false;

    public static Browsers BROWSER = Browsers.CHROME;

    public static TipoExecucao TIPO_EXECUCAO = TipoExecucao.LOCAL;

    public enum Browsers {
        CHROME,
        FIREFOX,
        IE
    }

    public enum TipoExecucao {
        LOCAL,
        GRID,
        NUVEM

    }
}
