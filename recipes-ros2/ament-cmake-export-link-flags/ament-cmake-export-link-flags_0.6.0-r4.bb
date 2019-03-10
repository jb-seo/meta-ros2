# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to export link flags to downstream packages in the ament buildsystem."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_export_link_flags/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "54fa52cd187f34270a67d6e423c099ec"
SRC_URI[sha256sum] = "59d88b37a8a8049a2d407a8c69486641651445fc1b5198f06fef3220d7fae4ea"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_export_link_flags-0.6.0-4"

inherit catkin
