# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to export interfaces to downstream packages in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_export_interfaces/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ce3fcd7f168dc60ad1af35404eedfa44"
SRC_URI[sha256sum] = "0f84ed1468e7d643b66a3f00e88dd317fa521e9c46e42f996f777d2e2b8c63a3"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_export_interfaces-0.6.0-4"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
