# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Model-based distributed configuration handling."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " builtin-interfaces rclcpp rclcpp-lifecycle std-msgs"
SRC_URI = "https://github.com/microROS/system_modes-release/archive/release/crystal/system_modes/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7571f34b9e57326417019c9450ee7dac"
SRC_URI[sha256sum] = "054f49641bc1ebe16f4dc4b169fe092deae93d2853c30218c83bc8537bd4f4cb"
S = "${WORKDIR}/system_modes-release-release-crystal-system_modes-0.1.1-0"

inherit ament
