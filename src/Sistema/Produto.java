/**
 * Codigo para descrever a tabela "produto" do banco de dados "Sistema"
 * @author Brygtany Lima
 * @since 04/11/2024
 */
package Sistema;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p")
    , @NamedQuery(name = "Produto.findById", query = "SELECT p FROM Produto p WHERE p.id = :id")
    , @NamedQuery(name = "Produto.findByCod", query = "SELECT p FROM Produto p WHERE p.cod = :cod")
    , @NamedQuery(name = "Produto.findByStatus", query = "SELECT p FROM Produto p WHERE p.status = :status")
    , @NamedQuery(name = "Produto.findByNome", query = "SELECT p FROM Produto p WHERE p.nome = :nome")
    , @NamedQuery(name = "Produto.findByQtdEstoque", query = "SELECT p FROM Produto p WHERE p.qtdEstoque = :qtdEstoque")
    , @NamedQuery(name = "Produto.findByEstoqueMinimo", query = "SELECT p FROM Produto p WHERE p.estoqueMinimo = :estoqueMinimo")
    , @NamedQuery(name = "Produto.findByEstoqueMaximo", query = "SELECT p FROM Produto p WHERE p.estoqueMaximo = :estoqueMaximo")
    , @NamedQuery(name = "Produto.findByPrecoCompra", query = "SELECT p FROM Produto p WHERE p.precoCompra = :precoCompra")
    , @NamedQuery(name = "Produto.findByPrecoVenda", query = "SELECT p FROM Produto p WHERE p.precoVenda = :precoVenda")
    , @NamedQuery(name = "Produto.findByBarCode", query = "SELECT p FROM Produto p WHERE p.barCode = :barCode")
    , @NamedQuery(name = "Produto.findByNcm", query = "SELECT p FROM Produto p WHERE p.ncm = :ncm")
    , @NamedQuery(name = "Produto.findByFator", query = "SELECT p FROM Produto p WHERE p.fator = :fator")
    , @NamedQuery(name = "Produto.findByDataCadastro", query = "SELECT p FROM Produto p WHERE p.dataCadastro = :dataCadastro")
    , @NamedQuery(name = "Produto.findByImagem", query = "SELECT p FROM Produto p WHERE p.imagem = :imagem")})
public class Produto implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "cod")
    private String cod;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Column(name = "nome")
    private String nome;
    @Lob
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "qtd_estoque")
    private Integer qtdEstoque;
    @Column(name = "estoque_minimo")
    private Integer estoqueMinimo;
    @Column(name = "estoque_maximo")
    private Integer estoqueMaximo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "preco_compra")
    private BigDecimal precoCompra;
    @Basic(optional = false)
    @Column(name = "preco_venda")
    private BigDecimal precoVenda;
    @Column(name = "bar_code")
    private BigInteger barCode;
    @Column(name = "ncm")
    private String ncm;
    @Basic(optional = false)
    @Column(name = "fator")
    private BigDecimal fator;
    @Basic(optional = false)
    @Column(name = "data_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;
    @Column(name = "imagem")
    private String imagem;

    public Produto() {
    }

    public Produto(Integer id) {
        this.id = id;
    }

    public Produto(Integer id, Character status, BigDecimal precoCompra, BigDecimal precoVenda, BigDecimal fator, Date dataCadastro) {
        this.id = id;
        this.status = status;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.fator = fator;
        this.dataCadastro = dataCadastro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        String oldCod = this.cod;
        this.cod = cod;
        changeSupport.firePropertyChange("cod", oldCod, cod);
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        Character oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        Integer oldQtdEstoque = this.qtdEstoque;
        this.qtdEstoque = qtdEstoque;
        changeSupport.firePropertyChange("qtdEstoque", oldQtdEstoque, qtdEstoque);
    }

    public Integer getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(Integer estoqueMinimo) {
        Integer oldEstoqueMinimo = this.estoqueMinimo;
        this.estoqueMinimo = estoqueMinimo;
        changeSupport.firePropertyChange("estoqueMinimo", oldEstoqueMinimo, estoqueMinimo);
    }

    public Integer getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(Integer estoqueMaximo) {
        Integer oldEstoqueMaximo = this.estoqueMaximo;
        this.estoqueMaximo = estoqueMaximo;
        changeSupport.firePropertyChange("estoqueMaximo", oldEstoqueMaximo, estoqueMaximo);
    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(BigDecimal precoCompra) {
        BigDecimal oldPrecoCompra = this.precoCompra;
        this.precoCompra = precoCompra;
        changeSupport.firePropertyChange("precoCompra", oldPrecoCompra, precoCompra);
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        BigDecimal oldPrecoVenda = this.precoVenda;
        this.precoVenda = precoVenda;
        changeSupport.firePropertyChange("precoVenda", oldPrecoVenda, precoVenda);
    }

    public BigInteger getBarCode() {
        return barCode;
    }

    public void setBarCode(BigInteger barCode) {
        BigInteger oldBarCode = this.barCode;
        this.barCode = barCode;
        changeSupport.firePropertyChange("barCode", oldBarCode, barCode);
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        String oldNcm = this.ncm;
        this.ncm = ncm;
        changeSupport.firePropertyChange("ncm", oldNcm, ncm);
    }

    public BigDecimal getFator() {
        return fator;
    }

    public void setFator(BigDecimal fator) {
        BigDecimal oldFator = this.fator;
        this.fator = fator;
        changeSupport.firePropertyChange("fator", oldFator, fator);
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        Date oldDataCadastro = this.dataCadastro;
        this.dataCadastro = dataCadastro;
        changeSupport.firePropertyChange("dataCadastro", oldDataCadastro, dataCadastro);
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        String oldImagem = this.imagem;
        this.imagem = imagem;
        changeSupport.firePropertyChange("imagem", oldImagem, imagem);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sistema.Produto[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
