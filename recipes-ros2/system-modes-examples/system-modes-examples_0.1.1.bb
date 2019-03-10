# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Simple example system for system_modes package."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rclcpp rclcpp-lifecycle system-modes"
SRC_URI = "https://github.com/microROS/system_modes-release/archive/release/crystal/system_modes_examples/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2d54012cf2683f304380604dff200d9f"
SRC_URI[sha256sum] = "2552e4632eea9077567ae66239faa75bdb0f05eb17b38db7b8912e020cf31a09"
S = "${WORKDIR}/system_modes-release-release-crystal-system_modes_examples-0.1.1-0"

inherit catkin
