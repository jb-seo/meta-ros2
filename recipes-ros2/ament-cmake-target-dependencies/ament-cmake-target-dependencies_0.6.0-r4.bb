# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to add definitions, include directories and libraries of a package to a target in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_target_dependencies/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f5e27e6c2aa65fdc1da83d9404ca4aa6"
SRC_URI[sha256sum] = "30e874b35b3772f81808b470a33ecdf0586c5785b0747e77c87888ce625b319f"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_target_dependencies-0.6.0-4"

inherit catkin
