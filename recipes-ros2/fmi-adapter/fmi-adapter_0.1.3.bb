# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wraps FMUs for co-simulation"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " launch launch-ros rclcpp rclcpp-lifecycle std-msgs"
SRC_URI = "https://github.com/boschresearch/fmi_adapter_ros2-release/archive/release/crystal/fmi_adapter/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "89a362e3ff6681140deeaefee2a411a5"
SRC_URI[sha256sum] = "9fef64ebe842649540c8cf39e015113ac89ae520f644c7119340064d82bfb7ba"
S = "${WORKDIR}/fmi_adapter_ros2-release-release-crystal-fmi_adapter-0.1.3-0"

inherit ament
