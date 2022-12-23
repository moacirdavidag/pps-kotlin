import Command as Command

class LampadaInteligenteCommand : Command {
    private var lampadaInteligente: LampadaInteligente

    constructor(lampada: LampadaInteligente) {
        this.lampadaInteligente = lampada
    }

    override fun executar() {
        this.lampadaInteligente.ligar()
        println("A lâmpada foi ligada!")
    }

    override fun desfazer() {
        this.lampadaInteligente.desligar()
        println("A lâmpada foi desligada!")
    }
}