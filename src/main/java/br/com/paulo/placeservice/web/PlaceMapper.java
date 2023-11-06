package br.com.paulo.placeservice.web;

import br.com.paulo.placeservice.api.PlaceResponse;
import br.com.paulo.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place) {
        return new PlaceResponse(place.name(), place.slug(), place.state(), place.createdAt(), place.updatedAt());
    }
}
