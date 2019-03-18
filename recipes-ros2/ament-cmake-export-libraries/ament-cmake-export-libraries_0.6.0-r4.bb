# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to export libraries to downstream packages in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_export_libraries/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a5d25ada1195e5a56f40aedeeaa1c752"
SRC_URI[sha256sum] = "d4bee14792a30fa8d83965e2bd5f34763bfcd448329f347f99d1b4a49dfbe21b"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_export_libraries-0.6.0-4"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
