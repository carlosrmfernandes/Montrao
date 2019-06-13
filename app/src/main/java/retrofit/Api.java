package retrofit;

import java.util.List;

import retrofit.endpoint.AlunosEndpoint;
import retrofit.endpoint.GraduacoesEndpoint;
import retrofit.endpoint.ModalidadeEndpoint;
import retrofit.endpoint.PlanosEndpoint;
import retrofit.model.AlunoModel;
import retrofit.model.GraduacoesModel;
import retrofit.model.ModalidadeModel;
import retrofit.model.PlanosModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {

    public static final String BASE_URL = "http://api.m3.nextcodeapp.com.br/";
    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl( BASE_URL)
            .addConverterFactory(GsonConverterFactory. create())
            .build();
    /**
     * Busca o treino semanal.
     */
    public static void GetAlunos(long id_conta, Callback<List<AlunoModel>> callback) {
        AlunosEndpoint endpoint = retrofit.create(AlunosEndpoint. class);
        Call<List<AlunoModel>> call = endpoint.buscarAlunos(id_conta);
        call.enqueue(callback);
    }

    public static void PostAlunos(AlunoModel a, Callback<Boolean> callback) {
        AlunosEndpoint endpoint = retrofit.create(AlunosEndpoint. class);
        Call<Boolean> call = endpoint.inserirAluno(a);
        call.enqueue(callback);
    }

    public static void GetModalidade(long id_conta, Callback<List<ModalidadeModel>> callback) {
        ModalidadeEndpoint endpoint = retrofit.create(ModalidadeEndpoint. class);
        Call<List<ModalidadeModel>> call = endpoint.buscarModalidade(id_conta);
        call.enqueue(callback);
    }

    public static void PostModalidade(ModalidadeModel m, Callback<Boolean> callback) {
        ModalidadeEndpoint endpoint = retrofit.create(ModalidadeEndpoint. class);
        Call<Boolean> call = endpoint.inserirModalidade(m);
        call.enqueue(callback);
    }


    public static void GetGraduacoes(long id_conta, Callback<List<GraduacoesModel>> callback) {
        GraduacoesEndpoint endpoint = retrofit.create(GraduacoesEndpoint. class);
        Call<List<GraduacoesModel>> call = endpoint.buscarGraduacoes(id_conta);
        call.enqueue(callback);
    }

    public static void PostGraduacoes(GraduacoesModel g, Callback<Boolean> callback) {
        GraduacoesEndpoint endpoint = retrofit.create(GraduacoesEndpoint. class);
        Call<Boolean> call = endpoint.inserirGraduacoes(g);
        call.enqueue(callback);
    }

    public static void GetPlanos(long id_conta, Callback<List<PlanosModel>> callback) {
        PlanosEndpoint endpoint = retrofit.create(PlanosEndpoint. class);
        Call<List<PlanosModel>> call = endpoint.buscarPlanos(id_conta);
        call.enqueue(callback);
    }

    public static void PostPlanos(PlanosModel p, Callback<Boolean> callback) {
        PlanosEndpoint endpoint = retrofit.create(PlanosEndpoint. class);
        Call<Boolean> call = endpoint.inserirPlanos(p);
        call.enqueue(callback);
    }
}
