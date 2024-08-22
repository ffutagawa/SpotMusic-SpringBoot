package br.com.ffutagawa.service;

import br.com.ffutagawa.domain.Musica;

import java.util.List;

public interface MusicaService {

    void salvar (Musica musica, long playlistId);

    List<Musica> recuperarPorPlaylist(long playlistId);

    Musica recuperarPorPlaylistIdMusicaId(long playlistId, long musicaId);

    void atualizar (Musica musica, long playlistId);

    void excluir (long playlistId, long musicaId);

}
