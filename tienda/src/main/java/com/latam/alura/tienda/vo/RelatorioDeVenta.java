package com.latam.alura.tienda.vo;

import java.time.LocalDate;

public class RelatorioDeVenta {

	private String nobreDelProducto;
	private Long CantidadDeProducto;
	private LocalDate FechaDeUltimaVenta;
	
	public RelatorioDeVenta(String nobreDelProducto, Long cantidadDeProducto, LocalDate fechaDeUltimaVenta) {
		this.nobreDelProducto = nobreDelProducto;
		CantidadDeProducto = cantidadDeProducto;
		FechaDeUltimaVenta = fechaDeUltimaVenta;
	}

	public String getNobreDelProducto() {
		return nobreDelProducto;
	}

	public void setNobreDelProducto(String nobreDelProducto) {
		this.nobreDelProducto = nobreDelProducto;
	}

	public Long getCantidadDeProducto() {
		return CantidadDeProducto;
	}

	public void setCantidadDeProducto(Long cantidadDeProducto) {
		CantidadDeProducto = cantidadDeProducto;
	}
	
	

	@Override
	public String toString() {
		return "RelatorioDeVenta [nobreDelProducto=" + nobreDelProducto + ", CantidadDeProducto=" + CantidadDeProducto
				+ ", FechaDeUltimaVenta=" + FechaDeUltimaVenta + "]";
	}

	
	
	
}
