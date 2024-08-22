package br.com.ffutagawa.dao;

import br.com.ffutagawa.domain.Playlist;

import java.util.List;

public interface PlaylistDao {

    void salvar (Playlist playlist);

    List<Playlist> recuperar();

    Playlist recuperarPorId(long id);

    void atualizar(Playlist playlist);

    void excluir(long id);

}
