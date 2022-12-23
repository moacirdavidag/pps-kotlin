class LampadaInteligenteInvoker {

    private var comandos: MutableMap<String, LampadaInteligenteCommand> = mutableMapOf()

    fun adicionarComando(id: String, comando: LampadaInteligenteCommand) {
        comandos[id] = comando
    }

    fun executarComando(id: String) {
        if(this.comandos.containsKey(id)) {
            this.comandos[id]?.executar()
        }
    }

    fun desfazerComando(id: String) {
        if(this.comandos.containsKey(id)) {
            this.comandos[id]?.desfazer()
        }
    }
}