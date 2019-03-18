# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides small examples for use of the fmi_adapter package"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " fmi-adapter launch launch-ros"
SRC_URI = "https://github.com/boschresearch/fmi_adapter_ros2-release/archive/release/crystal/fmi_adapter_examples/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fe3903c62402f6fe819efdfbbfb52e28"
SRC_URI[sha256sum] = "d7f11e0bf4166888fe9cbdee74a25ae52063a844708dc92accfe267c6f025c4a"
S = "${WORKDIR}/fmi_adapter_ros2-release-release-crystal-fmi_adapter_examples-0.1.3-0"

inherit ament
