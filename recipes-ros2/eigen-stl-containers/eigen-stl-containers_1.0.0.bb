# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a set of typedef's that allow   using Eigen datatypes in STL containers"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake eigen"
SRC_URI = "https://github.com/ros2-gbp/eigen_stl_containers-release/archive/release/crystal/eigen_stl_containers/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "87347ed583ff3b1eab9695261a1bca7d"
SRC_URI[sha256sum] = "dd870ca56fe118b51f00459340ffcf4cef968c1c6e27f8eab9326b9f02c95ee4"
S = "${WORKDIR}/eigen_stl_containers-release-release-crystal-eigen_stl_containers-1.0.0-0"

inherit catkin
