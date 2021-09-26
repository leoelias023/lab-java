package me.develeo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class FileSize {

  private static String[] args;

  private static void initializeArgs(String[] receivedArgs) {
    args = receivedArgs;
  }

  private static Optional<String> getArg(int index) {
    try {
      return Optional.of(args[index]);
    } catch (IndexOutOfBoundsException e) {
      return Optional.empty();
    }
  }
  public static void main(String[] args) {
    initializeArgs(args);

    getArg(0).ifPresentOrElse(
      path -> {
        try {
          System.out.println(String.format(
            "O tamanho do arquivo é %s",
            Files.getAttribute(Path.of(path), "size")
              .toString()
          ));
        } catch(FileNotFoundException exception) {
          System.out.println("O arquivo especificado não foi encontrado");
        } catch(IOException exception) {
          System.out.println("Um erro inesperado ocorreu ao ler o arquivo");
        }
      },
      () -> {
        throw new IllegalArgumentException("Especifique um arquivo para obter detalhes");
      }
    );
  }
}