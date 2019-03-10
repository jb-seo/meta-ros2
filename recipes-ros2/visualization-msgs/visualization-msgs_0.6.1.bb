# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some visualization and interaction related message definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/crystal/visualization_msgs/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "455e46c4b9b3e6df4f6ab515e8419976"
SRC_URI[sha256sum] = "77169a17f41ace0b652fcfc75f70e9bb8aa505967d2fdc13c3a95125d99002ad"
S = "${WORKDIR}/common_interfaces-release-release-crystal-visualization_msgs-0.6.1-0"

inherit catkin
