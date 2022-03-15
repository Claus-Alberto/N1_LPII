import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static String readedLine;
    private static List<Funcionario> funcionarios = new ArrayList<>();
    private static String[] txtLine;
    private static Long i = 1L;
    private static LocalDate nascimento;
    private static LocalDateTime contratacao;

    public static void main(String[] args) throws Exception {
        InputStream inputstream = new FileInputStream("dados.txt");
        InputStreamReader reader = new InputStreamReader(inputstream);
        BufferedReader br = new BufferedReader(reader);
        while((readedLine = br.readLine()) != null){
            txtLine = readedLine.split(";");
            System.out.println("" + txtLine[0]);

            String funcNome = txtLine[0];

            Long funcCodigo = i;

            nascimento = LocalDate.of(
                Integer.parseInt(txtLine[3].split("-")[0]), 
                Integer.parseInt(txtLine[3].split("-")[1]), 
                Integer.parseInt(txtLine[3].split("-")[2])
            );

            contratacao = LocalDateTime.of(
                Integer.parseInt(txtLine[4].split("-")[0]), 
                Integer.parseInt(txtLine[4].split("-")[1]), 
                Integer.parseInt(txtLine[4].split("-")[2].split(" ")[0]),
                Integer.parseInt(txtLine[4].split("-")[2].split(" ")[1].split(":")[0]), 
                Integer.parseInt(txtLine[4].split("-")[2].split(" ")[1].split(":")[1]), 
                Integer.parseInt(txtLine[4].split("-")[2].split(" ")[1].split(":")[2].split("\\.")[0])
            );
            String[] cargoNameSplited = txtLine[1].split(" ");
            cargoNameSplited[0] = "";
            String cargoNome = String.join(" ", cargoNameSplited).trim();
            System.out.println(cargoNome);

            Long cargoCodigo = Long.parseLong("" + txtLine[1].split(" ")[0].trim());
            System.out.println("" + cargoCodigo);

            Cargo cargo = new Cargo(cargoCodigo, cargoNome);

            String[] departNameSplited = txtLine[1].split(" ");
            departNameSplited[0] = "";
            String departamentoNome = String.join(" ", departNameSplited).trim();
            System.out.println(departamentoNome);

            Long departamentoCodigo = Long.parseLong("" + txtLine[2].split(" ")[0].trim());
            System.out.println("" + departamentoCodigo);

            Departamento departamento = new Departamento(departamentoCodigo, departamentoNome);

            funcionarios.add(new Funcionario(departamento, cargo, funcCodigo, funcNome, nascimento, contratacao));

            i++;
        }
        br.close();
        FileOutputStream arquivo = new FileOutputStream("objetos.db");
        ObjectOutputStream recorder = new ObjectOutputStream(arquivo);
        recorder.writeObject(funcionarios);
        recorder.close();
        arquivo.close();
    }
}
