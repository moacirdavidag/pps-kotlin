import observer.IObservador
import observer.IObservavel

class JornalObservavel : IObservavel {
    override var observadores: MutableList<IObservador> = mutableListOf()

    override fun adicionarObservadores(observador: IObservador) {
        if(!this.observadores.contains(observador)) {
            this.observadores.add(observador)
        }
        return
    }

    override fun removerObservador(observador: IObservador) {
        if(this.observadores.contains(observador)) {
            this.observadores.remove(observador)
        }
    }

    override fun notificar(noticia: String) {
        for(observador: IObservador in this.observadores) {
            observador.atualizar(noticia)
        }
    }

    fun adicionarNoticia(titulo: String) {
        this.notificar(titulo);
    }

}

