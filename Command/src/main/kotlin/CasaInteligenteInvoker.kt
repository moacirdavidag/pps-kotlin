class CasaInteligenteInvoker {
    private var comandos: MutableMap<String, LampadaInteligenteCommand> = mutableMapOf()

    fun adicionarComando(id: String, comando: LampadaInteligenteCommand) {
        this.comandos.set(id, comando)
    }

    fun executarComando(id: String) {
        if(this.comandos.containsKey(id)) {
            this.comandos[id]?.executar()
        }
        return
    }

    fun desfazerComando(id: String) {
        if(this.comandos.containsKey(id)) {
            this.comandos[id]?.desfazer()
        }
        return
    }
}