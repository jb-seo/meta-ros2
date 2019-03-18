# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some message definitions which describe geometric shapes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " geometry-msgs rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/crystal/shape_msgs/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4df2b093251d0664ab56c3645b95ccff"
SRC_URI[sha256sum] = "2bd53e9b315efdb349d6e057dd5d95c1ea48a947974cae7cbacb4cccf3bae682"
S = "${WORKDIR}/common_interfaces-release-release-crystal-shape_msgs-0.6.1-0"

inherit ament pythonpath-insane
