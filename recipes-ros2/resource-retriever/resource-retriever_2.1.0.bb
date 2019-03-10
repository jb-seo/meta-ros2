# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package retrieves data from url-format files such as http://,    ftp://, package:// file://, etc., and loads the data into memory.    The package:// url for ros packages is translated into a local    file:// url.  The resourse retriever was initially designed to load    mesh files into memory, but it can be used for any type of    data. The resource retriever is based on the the libcurl library."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ament-index-cpp libcurl-vendor"
SRC_URI = "https://github.com/ros2-gbp/resource_retriever-release/archive/release/crystal/resource_retriever/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "734237c4a14e90216776fbb5887a8a37"
SRC_URI[sha256sum] = "9db42f615c9c1240dcae2f0ef91495e1177ab7c97acd884dfb38507e5d41660b"
S = "${WORKDIR}/resource_retriever-release-release-crystal-resource_retriever-2.1.0-0"

inherit catkin
