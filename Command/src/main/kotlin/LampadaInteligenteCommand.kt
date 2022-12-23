import Command as Command1

class LampadaInteligenteCommand : Command1 {

    private var lampada: LampadaInteligente

    constructor(lampada: LampadaInteligente) {
        this.lampada = lampada
    }

    override fun executar() {
        this.lampada.ligar()
    }

    override fun desfazer() {
       this.lampada.desligar()
    }
}