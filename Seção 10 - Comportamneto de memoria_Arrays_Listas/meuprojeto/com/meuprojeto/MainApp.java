<<<<<<< HEAD
// Pacote do seu projeto (pode ser diferente)
package com.meuprojeto;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import javax.swing.SwingUtilities;

/**
 * Classe principal que contém a lógica de manipulação de arquivos
 * e o ponto de entrada (main) para iniciar a interface gráfica.
 */
public class MainApp {

    /**
     * Ponto de entrada do programa.
     * Inicia a interface gráfica (GUI) de forma segura na thread de eventos do Swing.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AppGUI());
    }

    /**
     * Copia um diretório e todo o seu conteúdo de forma recursiva.
     * @param origem Path do diretório de origem.
     * @param destino Path do diretório de destino.
     * @throws IOException se ocorrer um erro de I/O.
     */
    public static void copiarDiretorio(Path origem, Path destino) throws IOException {
        Files.walkFileTree(origem, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                Path targetDir = destino.resolve(origem.relativize(dir));
                Files.createDirectories(targetDir);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Path targetFile = destino.resolve(origem.relativize(file));
                Files.copy(file, targetFile, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
                return FileVisitResult.CONTINUE;
            }
        });
    }

    /**
     * Exclui um caminho (arquivo ou diretório) forçadamente, tomando posse primeiro.
     * @param caminho Path do arquivo ou diretório a ser excluído.
     * @throws IOException se ocorrer um erro de I/O.
     */
    public static void excluirForcado(Path caminho) throws IOException {
        if (!Files.exists(caminho)) {
            throw new IOException("O caminho não existe: " + caminho);
        }

        // 1. Tomar posse do caminho para garantir permissão de exclusão.
        tomarPosse(caminho);

        // 2. Se for um diretório, exclui de forma recursiva. Se for um arquivo, exclui diretamente.
        if (Files.isDirectory(caminho)) {
            Files.walkFileTree(caminho, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    file.toFile().setWritable(true); // Garante que o arquivo não é "somente leitura"
                    Files.delete(file);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    Files.delete(dir);
                    return FileVisitResult.CONTINUE;
                }
            });
        } else {
            caminho.toFile().setWritable(true);
            Files.delete(caminho);
        }
    }

    /**
     * Altera o proprietário de um arquivo ou diretório (e seu conteúdo) para o grupo "Administradores".
     * @param caminho Path do arquivo ou diretório.
     * @throws IOException se ocorrer um erro de I/O.
     */
    private static void tomarPosse(Path caminho) throws IOException {
        UserPrincipalLookupService lookupService = FileSystems.getDefault().getUserPrincipalLookupService();
        UserPrincipal administratorsGroup = lookupService.lookupPrincipalByName("Administradores");

        if (Files.isDirectory(caminho)) {
            Files.walkFileTree(caminho, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    Files.setOwner(file, administratorsGroup);
                    return FileVisitResult.CONTINUE;
                }
                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    Files.setOwner(dir, administratorsGroup);
                    return FileVisitResult.CONTINUE;
                }
            });
        } else {
            Files.setOwner(caminho, administratorsGroup);
        }
    }
=======
// Pacote do seu projeto (pode ser diferente)
package com.meuprojeto;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import javax.swing.SwingUtilities;

/**
 * Classe principal que contém a lógica de manipulação de arquivos
 * e o ponto de entrada (main) para iniciar a interface gráfica.
 */
public class MainApp {

    /**
     * Ponto de entrada do programa.
     * Inicia a interface gráfica (GUI) de forma segura na thread de eventos do Swing.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AppGUI());
    }

    /**
     * Copia um diretório e todo o seu conteúdo de forma recursiva.
     * @param origem Path do diretório de origem.
     * @param destino Path do diretório de destino.
     * @throws IOException se ocorrer um erro de I/O.
     */
    public static void copiarDiretorio(Path origem, Path destino) throws IOException {
        Files.walkFileTree(origem, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                Path targetDir = destino.resolve(origem.relativize(dir));
                Files.createDirectories(targetDir);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Path targetFile = destino.resolve(origem.relativize(file));
                Files.copy(file, targetFile, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
                return FileVisitResult.CONTINUE;
            }
        });
    }

    /**
     * Exclui um caminho (arquivo ou diretório) forçadamente, tomando posse primeiro.
     * @param caminho Path do arquivo ou diretório a ser excluído.
     * @throws IOException se ocorrer um erro de I/O.
     */
    public static void excluirForcado(Path caminho) throws IOException {
        if (!Files.exists(caminho)) {
            throw new IOException("O caminho não existe: " + caminho);
        }

        // 1. Tomar posse do caminho para garantir permissão de exclusão.
        tomarPosse(caminho);

        // 2. Se for um diretório, exclui de forma recursiva. Se for um arquivo, exclui diretamente.
        if (Files.isDirectory(caminho)) {
            Files.walkFileTree(caminho, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    file.toFile().setWritable(true); // Garante que o arquivo não é "somente leitura"
                    Files.delete(file);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    Files.delete(dir);
                    return FileVisitResult.CONTINUE;
                }
            });
        } else {
            caminho.toFile().setWritable(true);
            Files.delete(caminho);
        }
    }

    /**
     * Altera o proprietário de um arquivo ou diretório (e seu conteúdo) para o grupo "Administradores".
     * @param caminho Path do arquivo ou diretório.
     * @throws IOException se ocorrer um erro de I/O.
     */
    private static void tomarPosse(Path caminho) throws IOException {
        UserPrincipalLookupService lookupService = FileSystems.getDefault().getUserPrincipalLookupService();
        UserPrincipal administratorsGroup = lookupService.lookupPrincipalByName("Administradores");

        if (Files.isDirectory(caminho)) {
            Files.walkFileTree(caminho, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    Files.setOwner(file, administratorsGroup);
                    return FileVisitResult.CONTINUE;
                }
                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    Files.setOwner(dir, administratorsGroup);
                    return FileVisitResult.CONTINUE;
                }
            });
        } else {
            Files.setOwner(caminho, administratorsGroup);
        }
    }
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
}