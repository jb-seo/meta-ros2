# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TODO"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " boost dwb-core nav2-msgs nav2-robot nav2-tasks nav2-util nav-2d-msgs nav-2d-utils rclcpp std-msgs"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/dwb_controller/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "875ebb8142072b4bace90995e78080dd"
SRC_URI[sha256sum] = "8fb3f0890a997286b0be5080f4d92feebeb1c7ccbade55eb2e2bfaa225bff90a"
S = "${WORKDIR}/navigation2-release-release-crystal-dwb_controller-0.1.5-0"

inherit ament
