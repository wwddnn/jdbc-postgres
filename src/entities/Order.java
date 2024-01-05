package entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Order {

	private Long id;
	private Double latitude;
	private Double longitude;
	private Instant moment;
	private OrderStatus status;
	
	// é a composição de produtos. ja que a relação entre Order e Product é uma relação de 1 para muitos.
	private List<Product> products = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<Product> getProducts() {
		return products;
	}
	//obs excluir o set da lista, nao faz sentido ela ser editada por aqui. mas sim pelos metodos add, etc.

	@Override
	public String toString() {
		return "Order [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", moment=" + moment
				+ ", status=" + status + "]";
	}


	
	
	
	
}
