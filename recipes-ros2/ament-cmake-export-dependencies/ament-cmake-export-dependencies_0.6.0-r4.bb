# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to export dependencies to downstream packages in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_export_dependencies/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c215470b9eca45df33c90a5fe2ac5456"
SRC_URI[sha256sum] = "513acf3033f8b363425859493c2d26fadf1504ed4ea9c22bf07ebf295c312148"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_export_dependencies-0.6.0-4"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
