package adapters;

/**
 * Created by auriane on 22/03/2017.





public class Cell_resultAdapter extends RecyclerView.Adapter<Cell_resultViewHolder>{

    private final Cell_result cell_result;

    private OnCellresultSelectedListener onCellresultSelectedListenernCellresultSelectedListener;

    public Cell_resultAdapter(Cell_result cell_result) {
        this.cell_result = cell_result;
    }

    @Override
    public ContractsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_contract, parent, false);
        return new ContractsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Cell_resultViewHolder holder, int position) {
        holder.setOnContractSelectedListener(onCellresultSelectedListener);
        holder.bind(cell_result.get(position));
    }

    @Override
    public int getItemCount() {
        return cell_result != null ? cell_result.size() : 0;
    }

    public void setOnContractSelectedListener(OnCellresultSelectedListener onCellresultSelectedListener) {
        this.onCellresultSelectedListener = onCellresultSelectedListener;
    }

}
 */



