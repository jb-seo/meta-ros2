# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to export include directories to downstream packages in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_export_include_directories/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e17fd7dd47df720af6fceb3704908006"
SRC_URI[sha256sum] = "23f9d32e56ee7e97f915711122a667dfafcc940e9727de4e782b9d0fc5dfc83c"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_export_include_directories-0.6.0-4"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
