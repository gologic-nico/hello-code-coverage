package hello;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Greeter {
    public String sayHello() {
        return "Hello Code Coverage!";
    }

    public String sayAuRevoir() {

        String inputUserFile = System.getProperty("user.dir") + "/pom.xml";

        System.out.println("Voici le basedir=" + System.getProperty("user.dir"));

        try (Stream<Path> walk = Files.walk(Paths.get(System.getProperty("user.dir")))) {

            List<String> result = walk.filter(Files::isRegularFile).map(x -> x.toString()).collect(Collectors.toList());

            result.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Source xslt = new StreamSource(new FileInputStream(inputUserFile));
            Transformer transformer = TransformerFactory.newInstance().newTransformer(xslt);
            Source allo = new StreamSource(new FileInputStream( System.getProperty("user.dir") + "/pom.xml"));
            transformer.transform(allo, new StreamResult());
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (inputUserFile != null) {
            System.out.println("Ajouter 1 ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 2 ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 3 ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 4 ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 5 ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 6 ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 7 ligne de code pour faire decendre le % de couverture");
            System.out.println(
                    "Ajouter 8 ligne de code pour faire decendre le % de couverture allo je biends de modifier une ligne qui existe");
            System.out.println("Ajouter 9 ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 10 ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 11ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 12 ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 13 ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 14 ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 15 ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 16 ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 17 ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 18 ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 19 ligne de code pour faire decendre le % de couverture");
            System.out.println("Ajouter 20 ligne de code pour faire decendre le % de couverture");
        }

        return "Au revoir Code Coverage!";
    }

    public String sayBonneJournee() {
        System.out.println("Ajouter 1 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 2 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 3 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 4 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 5 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 6 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 7 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 8 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 9 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 10 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 11ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 12 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 13 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 14 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 15 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 16 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 17 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 18 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 19 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 20 ligne de code pour faire decendre le % de couverture");
        return "Bonne journee Code Coverage!";
    }

    public String sayAstalaVista() {
        System.out.println("Ajouter 1 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 2 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 3 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 4 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 5 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 6 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 7 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 8 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 9 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 10 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 11ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 12 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 13 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 14 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 15 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 16 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 17 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 18 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 19 ligne de code pour faire decendre le % de couverture");
        System.out.println("Ajouter 20 ligne de code pour faire decendre le % de couverture");
        return "AstalaVista";
    }
}
