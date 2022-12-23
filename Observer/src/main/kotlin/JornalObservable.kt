class JornalObservable : IObservable {
    private var observadores: MutableList<IObserver> = mutableListOf()
    override fun adicionarObservador(observador: IObserver) {
        if(!this.observadores.contains(observador)) {
            this.observadores.add(observador)
        }
        return
    }

    override fun removerObservador(observador: IObserver) {
        if(this.observadores.contains(observador)) {
            this.observadores.remove(observador)
        }
        return
    }


    override fun notificar(algo: Any) {
        for(observador in this.observadores) {
            observador.atualizar(algo)
        }
    }

    fun adicionarNoticia(titulo: String) {
       this.notificar(titulo)
    }

}