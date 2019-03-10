# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_eigen"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake eigen geometry-msgs tf2 tf2-ros"
SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/crystal/tf2_eigen/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b05910428d826ec4ed7aa78cc22cd740"
SRC_URI[sha256sum] = "cfd1668cfa4bc1daff1156eaa9c84067d7179d5a0b140b749e6872fab29b882c"
S = "${WORKDIR}/geometry2-release-release-crystal-tf2_eigen-0.10.1-0"

inherit catkin
