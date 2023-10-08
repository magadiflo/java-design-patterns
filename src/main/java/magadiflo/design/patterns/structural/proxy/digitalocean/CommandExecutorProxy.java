package magadiflo.design.patterns.structural.proxy.digitalocean;

public class CommandExecutorProxy implements ICommandExecutor {
    private boolean isAdmin;
    private ICommandExecutor commandExecutor;

    public CommandExecutorProxy(String user, String password) {
        if (user.equals("magadiflo") && password.equals("12345")) {
            this.isAdmin = true;
        }
        this.commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (this.isAdmin) {
            this.commandExecutor.runCommand(cmd);
        } else {
            if (cmd.trim().contains("rm")) {
                throw new Exception("El comando '" + cmd + "' no está permitido para un usuario no administrador");
            } else {
                this.commandExecutor.runCommand(cmd);
            }
        }
    }
}
