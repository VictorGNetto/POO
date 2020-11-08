package aula9;

import java.io.*;

public class App {
    public static void LeBytePorByte(String fonte, String copia) throws IOException
    {
        FileInputStream in = new FileInputStream(fonte);
        FileOutputStream out = new FileOutputStream(copia);
        int c;

        while ((c = in.read()) != -1)
        {
            System.out.print(c);
            out.write(c);
        }

        in.close();
        out.close();
    }

    public static void LeLinhaPorLinha(String fonte) throws IOException
    {
        InputStream is = new FileInputStream(fonte);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();
        while (linha != null)
        {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }
    
    public static void main(String[] args) {
        File diretorio = new File("./aula9");
        String fonte = diretorio.getAbsolutePath() + "/fonte.txt";
        String copia = diretorio.getAbsolutePath() + "/copia.txt";

        try {
            LeBytePorByte(fonte, copia);
        } catch (Exception e) {
            System.err.println("Não foi possível ler o arquivo " + fonte + " ou escrever no arquivo " + copia);
        }

        System.out.println();

        try {
            LeLinhaPorLinha(fonte);
        } catch (Exception e) {
            System.err.println("Não foi possível ler o arquivo " + fonte);
        }
    }
}
