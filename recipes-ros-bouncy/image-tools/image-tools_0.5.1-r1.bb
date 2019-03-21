# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tools to capture and play back images to and from DDS subscriptions and publications."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rclcpp sensor-msgs std-msgs libopencv-dev"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/image_tools/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2092a4d266bea69e99114b0783076f9c"
SRC_URI[sha256sum] = "f6c22b9e435b48e9f4603f1ba1eca7bebca2545aea9616cf08e1871d6be96e02"
S = "${WORKDIR}/demos-release-release-bouncy-image_tools-0.5.1-1"

inherit ros
inherit ament


