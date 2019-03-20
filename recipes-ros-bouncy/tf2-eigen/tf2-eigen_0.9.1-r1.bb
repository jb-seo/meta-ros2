# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_eigen"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs tf2 tf2-ros eigen"
SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/bouncy/tf2_eigen/0.9.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "510acc500b00d9897310cb42f98dca8a"
SRC_URI[sha256sum] = "bdb944fa213578e9647fc45fdc4be5d735ab69f936128e686312f123a0c732cb"
S = "${WORKDIR}/geometry2-release-release-bouncy-tf2_eigen-0.9.1-1"


inherit ros
inherit ament

