# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common statistical structures and algorithms for control systems."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ecl-build ecl-config ecl-license ecl-linear-algebra ecl-mpl ecl-type-traits"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_statistics/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4087d30f7a005716d9b28a1c69af6534"
SRC_URI[sha256sum] = "a27f8fd665f798bb50774cf81cd42fa8139d3388c9df67db53d3e616144deba1"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_statistics-1.0.1-0"

inherit catkin
