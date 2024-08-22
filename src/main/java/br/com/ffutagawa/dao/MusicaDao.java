package br.com.ffutagawa.dao;

import br.com.ffutagawa.domain.Musica;

import java.util.List;

public interface MusicaDao {

    void salvar (Musica musica);

    List<Musica> recuperarPorPlaylist(long playlistId);

    Musica recuperarPorPlaylistIdMusicaId(long playlistId, long musicaId);

    void atualizar(Musica musica);

    void excluir(long musicaId);

}
