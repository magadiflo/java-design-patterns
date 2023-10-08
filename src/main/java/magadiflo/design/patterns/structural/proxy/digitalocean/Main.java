package magadiflo.design.patterns.structural.proxy.digitalocean;

public class Main {
    public static void main(String[] args) {
        ICommandExecutor executor = new CommandExecutorProxy("trainee", "miPass147$");
        try {
            String cmd = "cmd /c dir D:\\";
            executor.runCommand(cmd);

            System.out.println("**********************************************");

            cmd = "cmd /c rmdir /s /q D:\\test-directory-not-found";
            executor.runCommand(cmd);
        } catch (Exception e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
